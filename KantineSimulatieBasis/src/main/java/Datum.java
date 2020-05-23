public class Datum {

	private int dag;
	private int maand;
	private int jaar;


	public Datum(int dag, int maand, int jaar){
		this();
		if (bestaatDatum(dag, maand, jaar)){
			this.dag = dag;
			this.maand = maand;
			this.jaar = jaar;
		}
	}

	public Datum(){
		dag = 0;
		maand = 0;
		jaar = 0;
	}


// Eventueel kan deze switch statement gebruikt worden in de bestaatDatumfunctie
// 					switch (maand){
//						case 1:
//						case 3:
//						case 5:
//						case 7:
//						case 8:
//						case 10:
//						case 12:
//							return dag <= 31;
//						case 2:
//							if (jaar % 4 == 0) {
//								if (jaar % 100 == 0) {
//									if (jaar % 400 == 0) {
//										return dag <= 29;
//									}
//									else
//										return dag <= 28;
//								}
//								return dag <= 29;
//							}
//							else
//								return dag <= 28;
//						case 4:
//						case 6:
//						case 9:
//						case 11:
//							return dag <= 30;
//							default:
//								break;
//					}

	public boolean bestaatDatum(int dag, int maand, int jaar) {
		if (dag >= 1){
			if(maand >= 1 && maand <= 12) {
				if (jaar >= 1900 && jaar <= 2100){
					if (maand == 1 || maand == 3 || maand == 5 || maand == 7 || maand == 8 || maand == 10 || maand == 12) {
						return dag <= 31;
					}
					else if (maand == 2) {
						if (jaar % 4 == 0) {
							if (jaar % 100 == 0) {
								if (jaar % 400 == 0) {
									return dag <= 29;
								}
								else
									return dag <= 28;
							}
							return dag <= 29;
						}
						else
							return dag <= 28;
					}
					else
						return dag <= 30;
				}
			}
		}
		return false;
	}

	/**
	 * Getter voor Sting weergave van datum
	 *
	 * @return Geboortedatum
	 */
	public String getDatumAsString() {
		return String.format("%2d/%2d/%2d", dag, maand, jaar);
	}

	public int getDag(){return dag;}

	public int getMaand(){return maand;}

	public int getJaar(){return jaar;}

	public void setDag(int dag){ this.dag = dag;}

	public void setMaand(int maand){ this.maand = maand;}

	public void setJaar(int jaar){ this.jaar = jaar;}

}
