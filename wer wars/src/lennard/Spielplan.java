package lennard;

import java.util.Random;
import java.util.Set;

public class Spielplan {
    private Person m_dieb;
    private Set<Person > m_personen;

    public Spielplan() {
        m_personen = Set.of(
                new Person( "Knecht", Eigenschaft1.Gross, Eigenschaft2.KeineKopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Duenn,Eigenschaft5.Mann,Eigenschaft6.SchwarzeSchuhe),
                new Person( "Köchin", Eigenschaft1.Gross, Eigenschaft2.Kopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Dick,Eigenschaft5.Frau,Eigenschaft6.SchwarzeSchuhe ),
                new Person( "Soldat", Eigenschaft1.Klein, Eigenschaft2.Kopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Duenn,Eigenschaft5.Mann,Eigenschaft6.SchwarzeSchuhe ),
                new Person( "Hexe", Eigenschaft1.Klein, Eigenschaft2.Kopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Duenn,Eigenschaft5.Frau,Eigenschaft6.SchwarzeSchuhe ),
                new Person( "Magd", Eigenschaft1.Gross, Eigenschaft2.Kopfbedeckung,Eigenschaft3.KurzeAermel,Eigenschaft4.Duenn,Eigenschaft5.Frau,Eigenschaft6.SchwarzeSchuhe ),
                new Person( "Kindermädchen", Eigenschaft1.Gross, Eigenschaft2.Kopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Duenn,Eigenschaft5.Frau,Eigenschaft6.KeineSchwarzenSchuhe ),
                new Person( "Ritter", Eigenschaft1.Gross, Eigenschaft2.Kopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Duenn,Eigenschaft5.Mann,Eigenschaft6.KeineSchwarzenSchuhe ),
                new Person( "Burgfräulein", Eigenschaft1.Gross, Eigenschaft2.KeineKopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Duenn,Eigenschaft5.Frau,Eigenschaft6.SchwarzeSchuhe ),
                new Person( "Schmied", Eigenschaft1.Gross, Eigenschaft2.Kopfbedeckung,Eigenschaft3.KurzeAermel,Eigenschaft4.Duenn,Eigenschaft5.Mann,Eigenschaft6.SchwarzeSchuhe ),
                new Person( "Pfarrer", Eigenschaft1.Gross, Eigenschaft2.Kopfbedeckung,Eigenschaft3.LangeAermel,Eigenschaft4.Dick,Eigenschaft5.Mann,Eigenschaft6.SchwarzeSchuhe )
        );
        int zufall = new Random().nextInt(m_personen.size());
        m_dieb = m_personen.stream().skip(zufall).findFirst().get();
    }

    public Person getDieb() {
        return m_dieb;
    }
}
