package olive.model.abstractClass;

import olive.model.enums.OliveColorEnums;
import olive.model.enums.OliveNamesEnums;

public abstract class OliveModelAbstract
{
	private OliveNamesAbstract _typeOfOlive;
	private OliveColorAbstract _color;
	private double _yeild;

	public OliveNamesAbstract getTypeOfOlive()
	{
		return _typeOfOlive;
	}
	public OliveColorAbstract getColor()
	{
		return _color;
	}
	public double getYeild()
	{
		return _yeild;
	}
	public void setTypeOfOlive(OliveNamesAbstract typeOfOlive)
	{
		this._typeOfOlive = typeOfOlive;
	}
	public void setColor(OliveColorAbstract color)
	{
		this._color = color;
	}
	public void setYeild(double yeild)
	{
		this._yeild = yeild;
	}

	public OliveModelAbstract(OliveNamesAbstract kalamata, OliveColorAbstract purple, double yeild)
	{
		super();
		this._typeOfOlive = kalamata;
		this._color = purple;
		this._yeild = yeild;
	}

	public OliveModelAbstract()
	{
		super();
		this._typeOfOlive = OliveNamesAbstract.KALAMATA;
		this._color = OliveColorAbstract.BLACK;
		this._yeild = 3;
	}

	public OliveModelAbstract(OliveNamesEnums typeOfOlive)
	{
		super();
		this._color = OliveColorAbstract.BLACK;
		this._yeild = 3;
	}
	
	public abstract String getOrigin();
}