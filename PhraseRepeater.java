public class PhraseRepeater {
// instance variables (fields)
	String phrase;
	int repeats;

	public void setValues( String p, int r ) { // 'mutator', 'setter', 'modifier' gets inputs String p, and int r; doesn't return anything
		phrase = p;
		repeats = r;
	}

	public String getRepeatedPhrase() { // 'accessor method' doesn't change anything about PhraseRepeater, but does operation and returns value
		String result = "";
		for ( int i=0; i<repeats; i++ )
		result += phrase;
		return result;
	}
}