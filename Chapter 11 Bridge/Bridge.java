public interface Implementor
{
	public void operationImpl();
}

public class ConcreteImplementor implements Implementor
{
	public void operationImpl()
	{
		//����ʵ��
	}
}

public abstract class Abstraction
{
	protected Implementor impl;
	
	public void setImpl(Implementor impl)
	{
		this.impl=impl;
	}
	
	public abstract void operation();
}

public class RefinedAbstraction extends Abstraction
{
	public void operation()
	{
		//����
		impl.operationImpl();
		//����
	}
}