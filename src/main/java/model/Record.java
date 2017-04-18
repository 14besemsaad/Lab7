package model;

import javax.persistence.*;

@Entity
public class Record {
	@Id
	int id;
	String userId;
	String Scheme,TimeTaken,SState,TC1,TC1State,TC2,TC2State,TC3,TC3State,TC4,TC4State,TC5,TC5State,TC6,TC6State,TC7,TC7State;
	public Record(){}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTC6() {
		return TC6;
	}
	public void setTC6(String tC6) {
		TC6 = tC6;
	}
	public String getTC6State() {
		return TC6State;
	}
	public void setTC6State(String tC6State) {
		TC6State = tC6State;
	}
	public String getTC7() {
		return TC7;
	}
	public void setTC7(String tC7) {
		TC7 = tC7;
	}
	public String getTC7State() {
		return TC7State;
	}
	public void setTC7State(String tC7State) {
		TC7State = tC7State;
	}
	public String getScheme() {
		return Scheme;
	}
	public void setScheme(String scheme) {
		Scheme = scheme;
	}
	public String getTimeTaken() {
		return TimeTaken;
	}
	public void setTimeTaken(String timeTaken) {
		TimeTaken = timeTaken;
	}
	public String getSState() {
		return SState;
	}
	public void setSState(String sState) {
		SState = sState;
	}
	public String getTC1() {
		return TC1;
	}
	public void setTC1(String tC1) {
		TC1 = tC1;
	}
	public String getTC1State() {
		return TC1State;
	}
	public void setTC1State(String tC1State) {
		TC1State = tC1State;
	}
	public String getTC2() {
		return TC2;
	}
	public void setTC2(String tC2) {
		TC2 = tC2;
	}
	public String getTC2State() {
		return TC2State;
	}
	public void setTC2State(String tC2State) {
		TC2State = tC2State;
	}
	public String getTC3() {
		return TC3;
	}
	public void setTC3(String tC3) {
		TC3 = tC3;
	}
	public String getTC3State() {
		return TC3State;
	}
	public void setTC3State(String tC3State) {
		TC3State = tC3State;
	}
	public String getTC4() {
		return TC4;
	}
	public void setTC4(String tC4) {
		TC4 = tC4;
	}
	public String getTC4State() {
		return TC4State;
	}
	public void setTC4State(String tC4State) {
		TC4State = tC4State;
	}
	public String getTC5() {
		return TC5;
	}
	public void setTC5(String tC5) {
		TC5 = tC5;
	}
	public String getTC5State() {
		return TC5State;
	}
	public void setTC5State(String tC5State) {
		TC5State = tC5State;
	};
	
	
}
