package inheritance;

public class FullTimeEmployee extends PartTimeEmployee {
    private double basic,allowance;
    public FullTimeEmployee(String name,int age,String address,String department,String designation,double hours,double rate,double basic,double allowance) {
        super(name,age,address,department,designation,hours,rate);
        this.basic = basic;
        this.allowance = allowance;
        }
        public double getBasic() {
            return basic ;
        }
        public double getAllowance() {
            return allowance;
        }
        public void setAllowance(double allowance) {
            this.allowance=allowance;
        }
        public double setBasic(double basic) {
            return basic;
        }
      
          @Override
		public String toString() {
			return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + "]";
		}
		public double salary(){
           double fullTimeEmployee=getBasic()+(getBasic()*(getAllowance()/100));
            return fullTimeEmployee;
          }  
}
