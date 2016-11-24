import java.lang.Math;
import java.io.*;


public abstract class Device
{
    
    protected String m_name;
    protected float m_price;
    
    
    public String GetName ()
    {
        return m_name;
    }
    
    
    public void SetName (String name)
    {
        m_name = name;
    }
    
    
    public float GetPrice ()
    {
        return m_price;
    }
    
    
    public void SetPrice (float price)
    {
        m_price = price;
    }
    
    
    public Device ()
    {
        m_name = "";
        m_price = 0.0f;
    }
    
    
    public Device (String name, float price)
    {
        m_name = name;
        m_price = price;
    }
    
    
    public abstract String GetTypeIdentifier ();
    public abstract String ToString ();
}
