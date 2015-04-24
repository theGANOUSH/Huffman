public class HuffmanTree implements Comparable<HuffmanTree>
{
	int freq;

	public HuffmanTree()
	{

	}

	public int compareTo(HuffmanTree other)
	{
		// compareTo should return < 0 if this is supposed to be
		// less than other, > 0 if this is supposed to be greater than 
		// other and 0 if they are supposed to be equal

		if (this.freq < other.freq) return -1;
		else if (this.freq > other.freq) return 1;
		else return 0;
	}
}

