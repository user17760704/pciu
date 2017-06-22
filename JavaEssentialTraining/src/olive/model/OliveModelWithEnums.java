package olive.model;

public class OliveModelWithEnums
{
	private OliveNames _typeOfOlive; 
	private long _color;
	private double _yeild;
	
	public OliveNames getTypeOfOlive()
	{
		return _typeOfOlive;
	}
	public long getColor()
	{
		return _color;
	}
	public double getYeild()
	{
		return _yeild;
	}
	public void setTypeOfOlive(OliveNames typeOfOlive)
	{
		this._typeOfOlive = typeOfOlive;
	}
	public void setColor(long color)
	{
		this._color = color;
	}
	public void setYeild(double yeild)
	{
		this._yeild = yeild;
	}
	
	public OliveModelWithEnums(OliveNames typeOfOlive, long color, double yeild)
	{
		super();
		this._typeOfOlive = typeOfOlive;
		this._color = color;
		this._yeild = yeild;
	}
	
	public OliveModelWithEnums()
	{
		super();
		this._typeOfOlive = OliveNames.KALAMATA;
		this._color = 0x2E0854;
		this._yeild = 3;
	}
	
	public OliveModelWithEnums(OliveNames typeOfOlive)
	{
		super();
		this._color = 0x2E0854;
		this._yeild = 3;
	}
}