package quebec.culture.donnees;
import android.app.*;import android.content.*;import android.os.*;import android.widget.*;
public class EligibilityActivity extends Activity{
 private SharedPreferences p;
 private final String[] keys={"legal_form","culture_domain","constituted_12m","hq_quebec","private_control","not_individual","not_public_body","not_university","not_rena","no_default","integrity","not_insolvent","not_prev_supported","recognized_standard","concrete_upgrade","max_12m","quote_or_capacity","complete_templates","not_exploratory","not_routine","not_recurring","not_other_mcc_funded","web_under_50","api_under_50"};
 private final String[] labels={
  "Forme juridique admissible : OBNL, coopérative ou entreprise privée",
  "L’organisation travaille principalement dans un domaine du MCC, du CALQ ou de la SODEC",
  "L’organisation est légalement constituée depuis plus de 12 mois",
  "Le siège de l’organisation est au Québec",
  "Entreprise privée seulement : contrôle effectif majoritairement détenu par des citoyens/résidents permanents ayant leur résidence fiscale au Québec",
  "Le demandeur n’est pas une entreprise individuelle",
  "Le demandeur n’est pas un ministère, établissement de santé/éducation ou organisme public non admissible",
  "Le demandeur n’est pas une université ni un centre de recherche",
  "Le demandeur et ses sous-traitants ne sont pas inscrits au RENA",
  "Aucun défaut non réglé lié à une aide publique au cours des 2 années précédentes",
  "Le demandeur satisfait aux exigences d’intégrité",
  "Le demandeur n’est pas insolvable ou en faillite",
  "Le demandeur n’a pas déjà été soutenu lors d’un appel précédent de ce programme",
  "Le projet repose sur une des 5 normes reconnues",
  "Le projet vise concrètement la mise à niveau d’une base de données",
  "Le calendrier de réalisation est de 12 mois ou moins",
  "Un devis compétent ou une démonstration de capacité interne est disponible",
  "Le dossier est complet et conforme aux gabarits proposés",
  "Le projet n’est pas seulement exploratoire",
  "Le projet n’est pas du fonctionnement courant",
  "Le projet n’est pas de nature récurrente",
  "Le projet n’est pas financé par un autre programme du MCC/CALQ/SODEC",
  "Le développement d’un site Web représente 50 % ou moins des dépenses admissibles",
  "Le développement d’une API vers d’autres organisations Web représente 50 % ou moins des dépenses admissibles"};
 @Override public void onCreate(Bundle b){super.onCreate(b);Ui.bars(this);p=getSharedPreferences("eligibility",0);LinearLayout r=Ui.root(this);r.addView(Ui.text(this,"Admissibilité au programme",27,true));r.addView(Ui.text(this,"Auto-vérification interne basée sur les critères publiés par le ministère. Ce module ne remplace pas la décision officielle.",13,false));LinearLayout box=Ui.panel(this);for(int i=0;i<keys.length;i++){CheckBox c=new CheckBox(this);c.setText(labels[i]);c.setChecked(p.getBoolean(keys[i],false));final String k=keys[i];c.setOnCheckedChangeListener((v,checked)->p.edit().putBoolean(k,checked).apply());box.addView(c);}r.addView(box);TextView status=Ui.text(this,"",16,true);r.addView(status);Button calc=Ui.primary(this,"Recalculer l’admissibilité interne");calc.setOnClickListener(v->refresh(status));r.addView(calc);Button back=Ui.secondary(this,"Retour au centre de standardisation");back.setOnClickListener(v->finish());r.addView(back);refresh(status);setContentView(Ui.wrap(this,r));}
 private void refresh(TextView t){int n=0;for(String k:keys)if(p.getBoolean(k,false))n++;boolean ok=n==keys.length;t.setText("Critères confirmés : "+n+" / "+keys.length+"\nStatut interne : "+(ok?"aucun critère d’admissibilité manquant":"vérifications à compléter"));}
 public static boolean isComplete(android.content.Context c){SharedPreferences p=c.getSharedPreferences("eligibility",0);String[] ks={"legal_form","culture_domain","constituted_12m","hq_quebec","private_control","not_individual","not_public_body","not_university","not_rena","no_default","integrity","not_insolvent","not_prev_supported","recognized_standard","concrete_upgrade","max_12m","quote_or_capacity","complete_templates","not_exploratory","not_routine","not_recurring","not_other_mcc_funded","web_under_50","api_under_50"};for(String k:ks)if(!p.getBoolean(k,false))return false;return true;}
 public static int completedCount(android.content.Context c){SharedPreferences p=c.getSharedPreferences("eligibility",0);String[] ks={"legal_form","culture_domain","constituted_12m","hq_quebec","private_control","not_individual","not_public_body","not_university","not_rena","no_default","integrity","not_insolvent","not_prev_supported","recognized_standard","concrete_upgrade","max_12m","quote_or_capacity","complete_templates","not_exploratory","not_routine","not_recurring","not_other_mcc_funded","web_under_50","api_under_50"};int n=0;for(String k:ks)if(p.getBoolean(k,false))n++;return n;}
}