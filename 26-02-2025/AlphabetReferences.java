public class AlphabetReferences 
{
    public static void main(String[] args) 
	{
        char alphabet1 = 'A';
        char alphabet2 = 'B';
        char alphabet3 = 'C';
        char alphabet4 = 'D';
        char alphabet5 = 'E';
        char alphabet6 = 'F';
        char alphabet7 = 'G';
        char alphabet8 = 'H';
        char alphabet9 = 'I';
        char alphabet10 = 'J';

        char[] alphabetReferences = {alphabet1, alphabet2, alphabet3, alphabet4, alphabet5, 
                                     alphabet6, alphabet7, alphabet8, alphabet9, alphabet10};

        for (char alphabet : alphabetReferences) 
		{
            System.out.println(alphabet);
        }
    }
}
