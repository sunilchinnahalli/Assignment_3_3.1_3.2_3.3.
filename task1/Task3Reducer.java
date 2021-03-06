package mapreduce.assign3.task1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class Task3Reducer extends Reducer<Text, IntWritable, Text, IntWritable>
{	
int count;
 @suppressWarnings("unchecked")
	public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException
	{
		 count=0;
		for (IntWritable value : values) {
			
				count+ = value.get();
			}
		

		context.write(new Text(key), new IntWritable(count));
	}
}

