package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.List;

import ARTDArmour.ARTDBreastPlate;
import ARTDArmour.ARTDChain;
import ARTDArmour.ARTDCloth;
import ARTDArmour.ARTDLeather;
import ARTDArmour.ARTDPlate;
import ARTDArmour.ARTDSkin;
import ARTDArmour.ARTDStuddedLeather;

import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSpiders;
import ARTDShields.ARTDMagical_Shield;
import ARTDShields.ARTDMagical_Small_Shield;
import ARTDShields.ARTDMagical_Spiked_Shield;
import ARTDShields.ARTDSmall_Shield;
import ARTDShields.ARTDSpiked_Shield;
import ARTDShields.ARTDWooden_Shield;
import ARTDWeapons.ARTDBattleAxe;
import ARTDWeapons.ARTDBattleHammer;
import ARTDWeapons.ARTDCrossbow;
import ARTDWeapons.ARTDDaggger;
import ARTDWeapons.ARTDDart;
import ARTDWeapons.ARTDFlail;
import ARTDWeapons.ARTDHand;
import ARTDWeapons.ARTDJavelin;
import ARTDWeapons.ARTDLongSword;
import ARTDWeapons.ARTDLongbow;
import ARTDWeapons.ARTDShortSword;
import ARTDWeapons.ARTDShortbow;
import ARTDWeapons.ARTDSling;
import ARTDWeapons.ARTDStilleto;
import ARTDWeapons.ARTDSword;
import ARTDWeapons.ARTDWarNet;
import ARTDWeapons.ARTDWhip;

public class ARTDSingleton 
{

	private static ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	private static ARTDWeapons myWeapon = ARTDWeapons.Singleton();
	private static ARTDArmour myArmour = ARTDArmour.Singleton();
	private static ARTDShields myShields = ARTDShields.Singleton();
	private static ARTDSpells mySpells = ARTDSpells.Singleton();
	private static ARTDEnemies myMonsters = ARTDEnemies.Singleton();
	
	
	private static List<ARTDArmour> armourList = addArmour();
	private static List<ARTDEnemies> monsterList = addEnemies();
	private static List<ARTDWeapons> weaponList = addWeapon();
	//private static List<ARTDSpells> spellList = addSpells();
	private static List<ARTDShields> shieldList = addShields();
	
	//Singletons
	
	private static List<ARTDArmour> addArmour()
	{
		armourList = new ArrayList<ARTDArmour>();	
		
		  armourList.add(new ARTDSkin());
		  armourList.add(new ARTDCloth());
		  armourList.add(new ARTDLeather());
		  armourList.add(new ARTDStuddedLeather());
		  armourList.add(new ARTDChain());
		  armourList.add(new ARTDBreastPlate());
		  armourList.add(new ARTDPlate());
		
		return armourList;
		
	}
	
	private static List<ARTDShields> addShields() {
		
		shieldList = new ArrayList<ARTDShields>();
		
		shieldList.add(new ARTDWooden_Shield());
		shieldList.add(new ARTDSmall_Shield());
	    shieldList.add(new ARTDSpiked_Shield());
		shieldList.add(new ARTDMagical_Shield());
		shieldList.add(new ARTDMagical_Small_Shield());
		shieldList.add(new ARTDMagical_Spiked_Shield());
		
		
		return shieldList;
	}

	private static List<ARTDEnemies> addEnemies()
	{
		monsterList = new ArrayList<ARTDEnemies>();
		
	//	monsterList.add(new ARTDAssassins());
	//	monsterList.add(new ARTDBrigands());
	//	monsterList.add(new ARTDCutthroats());
	//	monsterList.add(new ARTDDevourer());
	//	monsterList.add(new ARTDDragon());
	//	monsterList.add(new ARTDDwarves());
	//	monsterList.add(new ARTDFlame_Demons());
	//	monsterList.add(new ARTDGhosts());
	//	monsterList.add(new ARDTGhouls());
	//	monsterList.add(new ARTDGiant_Bats());
	//	monsterList.add(new ARTDGladiators());
	//	monsterList.add(new ARTDGnolls());
	//	monsterList.add(new ARTDGnomes());
	//	monsterList.add(new ARTDGoblins());
	//	monsterList.add(new ARTDGremlins());
	//	monsterList.add(new ARTDGuards());
	//	monsterList.add(new ARTDHomunculi());
	//	monsterList.add(new ARTDHorned_Devils());
	//	monsterList.add(new ARTDIce_Demons());
	//	monsterList.add(new ARTDImps());
	//	monsterList.add(new ARTDKnights());
	//	monsterList.add(new ARDTLiches());
	//	monsterList.add(new ARTDMages());
	//	monsterList.add(new ARTDMaster_Thieves());
	//	monsterList.add(new ARTDMold());
	//	monsterList.add(new ARTDNight_Stalker());
	//	monsterList.add(new ARTDNoblemen());
	//	monsterList.add(new ARTDOrcs());
	//	monsterList.add(new ARTDPhoenix());
		monsterList.add(new ARTDRats());
	//	monsterList.add(new ARDTSalamander());
		monsterList.add(new ARTDSkeletons());
	//	monsterList.add(new ARTDSlime());
	//	monsterList.add(new ARTDSpectres());
		monsterList.add(new ARTDSpiders());
	//	monsterList.add(new ARTDStorm_Devils());
	//	monsterList.add(new ARTDThieves());	
	//	monsterList.add(new ARTDTrolls());
	//	monsterList.add(new ARTDValkyries());
	//	monsterList.add(new ARDTVampires());
	//	monsterList.add(new ARTDWhirlwind());
	//	monsterList.add(new ARTDWizard());
	//	monsterList.add(new ARTDWolves());
	//	monsterList.add(new ARTDWraiths());
		
		
		return monsterList;
	}
	
	/*
	 * private static List<ARTDSpells> addSpells() { spellList = new
	 * ArrayList<ARTDSpells>();
	 * 
	 * spellList.add(new ARTDCold_Blast()); spellList.add(new ARTDConjure_Food());
	 * spellList.add(new ARTDFireball()); spellList.add(new ARTDHeal());
	 * spellList.add(new ARTDLight()); spellList.add(new ARTDLocation());
	 * spellList.add(new ARTDShield()); spellList.add(new ARTDRandomStat());
	 * spellList.add(new ARTDPort());
	 * 
	 * 
	 * 
	 * return spellList;
	 * 
	 * }
	 */
	
	private static List<ARTDWeapons> addWeapon()
	{
		weaponList = new ArrayList<ARTDWeapons>();
		
		weaponList.add(new ARTDHand());
		weaponList.add(new ARTDDaggger());
		weaponList.add(new ARTDStilleto());
		weaponList.add(new ARTDDart());
		weaponList.add(new ARTDSling());
		weaponList.add(new ARTDShortSword());
		weaponList.add(new ARTDShortbow());
		weaponList.add(new ARTDWarNet());
		weaponList.add(new ARTDFlail());
		weaponList.add(new ARTDSword());
		weaponList.add(new ARTDWhip());
		weaponList.add(new ARTDCrossbow());
		weaponList.add(new ARTDLongSword());
		weaponList.add(new ARTDLongbow());
		weaponList.add(new ARTDJavelin());
		weaponList.add(new ARTDBattleAxe());
		weaponList.add(new ARTDBattleHammer());
		
		
		return weaponList;
		
	}	
	
	public static List<ARTDArmour> armourList()
	{
		return armourList;
	}
	
	public static ARTDArmour myArmourSingleton()
	{
		return myArmour;
	}
	 
	
	public static ARTDCharecter myCharSingleton()
	{
		return myChar;
	}
	
	public static List<ARTDEnemies> myMonsters()
	{
		if(monsterList.size() == 0)
		{
			addEnemies();
		}
		return monsterList;
	}
	

	
	public static ARTDSpells spellListSingleton()
	{
		return mySpells;
	}
	
	public static ARTDWeapons myWeaponSingleton()
	{
		return myWeapon;
	}
	
	/*
	 * public static List<ARTDSpells> spellList() { return spellList; }
	 */
	
	public static List<ARTDWeapons> weaponsList()
	{
		return weaponList;
	}
	
}
