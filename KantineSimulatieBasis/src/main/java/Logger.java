import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger{

        private static Logger i = new Logger();

        public Logger() {
            File file = new File("Logfile.log");
            if (file.exists()) {
                file.delete();
            }
        }
        //method that writes to the logfile
        public static void log(String msg){
            i._log(msg);
        }

        private void _log(String msg){
            try{
                FileWriter fw = new FileWriter("Logfile.log", true);
                String pattern = "yyyy-MM-dd HH:mm:ss";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String date = simpleDateFormat.format(new Date());
                fw.append(date).append(" ").append(msg).append("\n");
                fw.close();
            }
            catch (IOException e){

            }
        }

}