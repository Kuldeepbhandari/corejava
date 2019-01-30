package InterfaceandAbstract;
abstract class TrainerModule implements TrainingModuleInterf {
	protected int count;
	
	protected abstract void Sessioprovide();
public int count()
{
	this.count=this.count+1;
	return this.count;
}
}
