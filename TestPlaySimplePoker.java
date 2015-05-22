
import PJ5.SimplePoker;

class TestPlaySimplePoker {

    public static void main(String args[]) 
    {
		SimplePoker mypokergame;
		if (args.length > 0)
			mypokergame = new SimplePoker(Integer.parseInt(args[0]));
		else
			mypokergame = new SimplePoker();
		mypokergame.play();
    }
}
