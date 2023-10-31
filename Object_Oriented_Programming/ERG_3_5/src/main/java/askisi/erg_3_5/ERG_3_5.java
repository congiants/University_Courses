package askisi.erg_3_5;

public class ERG_3_5 {
    
    static void pirgoiHanoi(int disks, char apo_steilo, char se_steilo, char balader)
{
    if (disks == 0)
    {
        return;
    }
    pirgoiHanoi(disks - 1, apo_steilo, balader, se_steilo);
    System.out.println("" +apo_steilo +"->" + se_steilo );
    pirgoiHanoi(disks - 1, balader, se_steilo, apo_steilo);
}

    public static void main(String[] args) {
        pirgoiHanoi(4, '1', '2', '3');
    }
}
