package list;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{
	@Override
	public int compare(Music 음악1, Music 음악2) {
		return  음악2.getTitle().compareTo(음악1.getTitle()); 
	}

}
