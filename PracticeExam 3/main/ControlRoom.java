public class ControlRoom {

    private ArrayList<StatusManager> buildings;

    public ControlRoom() {

        this.buildings = new arrayList<>();
    }

	public void addBuilding(StausManager building){
		
		this.buildings.add(building);
	}

	public ArrayList<StatusManager> getBuildings(){
		
	}
    public boolean isNuclearReactorStable(){

		for(StatusManager b : getBuildings()){
			if(b.getStatus() != Status.Stable){
				
				return false;
			}
		}
      return true;
    }
}
