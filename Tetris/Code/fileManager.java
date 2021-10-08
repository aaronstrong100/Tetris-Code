import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class fileManager{
	public static void main(String args[]){
		try{
			EasyReader scoreGetter = new EasyReader("scoreHolder.txt");
			String newestScore = scoreGetter.readLine();
			if(newestScore.length()>0)
			{
				newestScore+="\n";
				FileWriter myFileWriter = new FileWriter("leaderboard.txt",true);
				myFileWriter.write(newestScore);
				myFileWriter.close();
			}
			else
			{
				newestScore="nonplayer;0\n";
				FileWriter myFileWriter = new FileWriter("leaderboard.txt",true);
				myFileWriter.write(newestScore);
				myFileWriter.close();
			}
			System.out.println(newestScore);
		}
		catch(IOException e){
			
		}
	}
}