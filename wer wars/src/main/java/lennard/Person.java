package lennard;

public class Person {
    private String m_name;
    private Eigenschaft1 m_eigenschaft1;
    private Eigenschaft2 m_eigenschaft2;
    private Eigenschaft3 m_eigenschaft3;
    private Eigenschaft4 m_eigenschaft4;
    private Eigenschaft5 m_eigenschaft5;
    private Eigenschaft6 m_eigenschaft6;

    public Person(
            String name,
            Eigenschaft1 eigenschaft1,
            Eigenschaft2 eigenschaft2,
            Eigenschaft3 eigenschaft3,
            Eigenschaft4 eigenschaft4,
            Eigenschaft5 eigenschaft5,
            Eigenschaft6 eigenschaft6

    ) {
        m_name = name;
        m_eigenschaft1 = eigenschaft1;
        m_eigenschaft2 = eigenschaft2;
        m_eigenschaft3 = eigenschaft3;
        m_eigenschaft4 = eigenschaft4;
        m_eigenschaft5 = eigenschaft5;
        m_eigenschaft6 = eigenschaft6;
    }

    public String getName() {
        return m_name;
    }

    public Eigenschaft1 getEigenschaft1() {
        return m_eigenschaft1;
    }
    public Eigenschaft2 getEigenschaft2() {
        return m_eigenschaft2;
    }

    public Eigenschaft3 getEigenschaft3() {
        return m_eigenschaft3;
    }

    public Eigenschaft4 getEigenschaft4() {
        return m_eigenschaft4;
    }

    public Eigenschaft5 getEigenschaft5() {
        return m_eigenschaft5;
    }

    public Eigenschaft6 getEigenschaft6() {
        return m_eigenschaft6;
    }

    @Override
    public String toString() {
        return String.format("%s: %s, %s, %s, %s, %s, %s", m_name,m_eigenschaft1,m_eigenschaft2,m_eigenschaft3,m_eigenschaft4,m_eigenschaft5,m_eigenschaft6);
    }
}
