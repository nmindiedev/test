import java.lang.Math;
import java.io.*;


public class Scanner extends Device
{
    
    int m_resolutionDPI;
    
    
    public int GetResolutionDPI ()
    {
        return m_resolutionDPI;
    }
    
    
    public void SetResolutionDPI (int value)
    {
        m_resolutionDPI = value;
    }
    
    
    public Scanner ()
    {
        super ("", 0f);
        m_resolutionDPI = 150;
    }
    
    
    public Scanner (int resolutionDPI, String name, float price)
    {
        super (name, price);
        m_resolutionDPI = resolutionDPI;
    }
    
    
    public String GetTypeIdentifier ()
    {
        return "Scanner";
    }
    
    
    public String ToString ()
    {
        return GetTypeIdentifier () + " { name='" + m_name + "'; price=" + m_price + "; resolution dpi=" + m_resolutionDPI + " }";
    }
}
