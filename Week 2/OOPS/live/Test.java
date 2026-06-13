package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
    public static void main(String[] args) {
        Veena veena=new Veena();
        veena.Play();

        Saxophone saxophone=new Saxophone();
        saxophone.Play();

        Playable p;
        p=new Veena();
        p.Play();

        p=new Saxophone();
        p.Play();
    }
}
