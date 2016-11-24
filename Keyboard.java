import java.lang.Math;
import java.io.*;


public class Keyboard extends Device
{
    
    protected boolean m_hasSpecialKeys;
    
    
    public boolean HasSpecialKeys ()
    {
        return m_hasSpecialKeys;
    }
    
    
    public void SetHasSpecialKeys (boolean value)
    {
        m_hasSpecialKeys = value;
    }
    
    
    public Keyboard ()
    {
        super ("", 0f);
        m_hasSpecialKeys = false;
    }
    
    
    public Keyboard (boolean hasSpecialKeys, String name, float price)
    {
        super (name, price);
        m_hasSpecialKeys = hasSpecialKeys;
    }
    
    
    public String GetTypeIdentifier ()
    {
        return "Keyboard";
    }
    
    
    public String ToString ()
    {
        return GetTypeIdentifier () + " { name='" + m_name + "'; price=" + m_price + "; special keys=" + m_hasSpecialKeys + " }";
    }
}
