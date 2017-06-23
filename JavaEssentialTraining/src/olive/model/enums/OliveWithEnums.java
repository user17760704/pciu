package olive.model.enums;

public class OliveWithEnums
{
	private OliveEnums _typeOfOlive; 
	private long _color;
	private double _yeild;
	
	public OliveEnums getTypeOfOlive()
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
	public void setTypeOfOlive(OliveEnums typeOfOlive)
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
	
	public OliveWithEnums(OliveEnums typeOfOlive, long color, double yeild)
	{
		super();
		this._typeOfOlive = typeOfOlive;
		this._color = color;
		this._yeild = yeild;
	}
	
	public OliveWithEnums()
	{
		super();
		this._typeOfOlive = OliveEnums.KALAMATA;
		this._color = 0x2E0854;
		this._yeild = 3;
	}
	
	public OliveWithEnums(OliveEnums typeOfOlive)
	{
		super();
		this._color = 0x2E0854;
		this._yeild = 3;
	}
}