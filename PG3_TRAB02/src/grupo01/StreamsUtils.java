package grupo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class StreamsUtils {

    public static boolean validate( Reader in ) throws IOException {

        /** The reader that is being read. */
        BufferedReader bufferedReader = new BufferedReader(in);
        String line = bufferedReader.readLine();

       if(line!=null){
            int index= line.indexOf("{");
                if(index!=-1){
                    String str = line.substring(index+1);
                    int secondIndex= str.indexOf("}");
                    if(secondIndex==-1) return false;
                }
           line= bufferedReader.readLine();
       }else{
           throw new IOException("cannot read from file");
       }
       return true;
    }

}
