package mapreduce.assign3.task1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class Task3Mapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
           String line=value.toString();
		String[] lineArray = line.split("\\|");
		
		if(linearray.length>1){
              if(!(linearray[0].equalsIgnoreCase("NA") || linearray[1].equalsIgnoreCase("NA)))
                  
                {
                  if(linearray[0].equalsIgnoreCase("onida"))
                   {   
		
		          context.write(new Text(linearray[0]),new Intwritable(1));
                    }
	           }
              }
          }
}
