package InterfaceandAbstract;

 abstract class TrainingModule1 implements TrainingModuleInterf{
	 protected int count;
	 protected abstract void SessionAttend();
	 
	 public int count()
	 {
		this.count=this.count+1;
		return this.count;
	 }
	 

}
