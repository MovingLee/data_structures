import java.util.HashMap;
import java.util.Map;

public class myStudent implements Student{
	
	public myStudent(String name, boolean male, int yob) {
		name = getName();
		Section;
		Grade;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTranscript(mySection section, myGrade grade) {
		// TODO Auto-generated method stub
		transcript.add(section, grade);
	}

	@Override
	public void printTranscript() {
		// TODO Auto-generated method stub
		System.out.println(transcript);
	}
	
	private class Transcript {
		Map map = new HashMap();
		void add(Section section, Grade grade) {
			map.put(section, grade);
		}
		
		public String toString() {
			return map.toString();
		}
	}

}
