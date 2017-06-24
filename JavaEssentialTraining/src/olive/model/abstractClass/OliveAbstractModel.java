package olive.model.abstractClass;

import olive.model.enums.OliveColorEnums;
import olive.model.enums.OliveNamesEnums;

public abstract class OliveAbstractModel
{
	private OliveNamesEnums _typeOfOlive;
	private OliveColorEnums _color;
	private double _yeild;

	public OliveNamesEnums getTypeOfOlive()
	{
		return _typeOfOlive;
	}
	public OliveColorEnums getColor()
	{
		return _color;
	}
	public double getYeild()
	{
		return _yeild;
	}
	public void setTypeOfOlive(OliveNamesEnums typeOfOlive)
	{
		this._typeOfOlive = typeOfOlive;
	}
	public void setColor(OliveColorEnums color)
	{
		this._color = color;
	}
	public void setYeild(double yeild)
	{
		this._yeild = yeild;
	}

	public OliveAbstractModel(OliveNamesEnums typeOfOlive, OliveColorEnums color, double yeild)
	{
		super();
		this._typeOfOlive = typeOfOlive;
		this._color = color;
		this._yeild = yeild;
	}

	public OliveAbstractModel()
	{
		super();
		this._typeOfOlive = OliveNamesEnums.KALAMATA;
		this._color = OliveColorEnums.BLACK;
		this._yeild = 3;
	}

	public OliveAbstractModel(OliveNamesEnums typeOfOlive)
	{
		super();
		this._color = OliveColorEnums.BLACK;
		this._yeild = 3;
	}
	
	public abstract String getOrigin();
}