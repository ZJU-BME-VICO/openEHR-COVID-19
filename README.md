# OpenEHR Templates and GDL Rules for COVID-19

## Motivation

Coronavirus disease 2019 (COVID-19) is becoming a global concern. It not only causes mortality and threats to people's health but also consumes healthcare resources and making healthcare services unavailable for other people and also strikes the regular order of society and economics.

While the medical researchers are establishing efficient diagnostic measures and effective treatment methodologies and clinicians are fighting with the disease in every corner of the world, we believe informaticists are also obligatory to do something to help with this. Some informaticists are already working on modeling the essential data items for COVID-19 with the hope of facilitating sharing data and developing applications. It would be natural next-step to think about sharing the latest evidence-based best practice to the world, since COVOD-19 is a novel disease to every clinician.

With the hope of sharing evidence-based knowledge on the diagnosis and treatment of COVID-19 gained in China in the past two months, we have authored the Chinese COVID-19 diagnosis and treatment guideline with Guideline Definition Language (GDL) in the past weeks. The original Chinese narrative text guideline was segmented, structured, marked up, and then translated into English. Entities were mapped to the openEHR temples that we are building, and their relationships are represented in GDL with GDL2 Editor. The GDL rules are further translated to Drools rules for execution. A demonstration clinical decision support system has been developed accordingly.

At this moment of time, we are heading for clinical implementations. In the meantime, we are glade to share the knowledge we gained in the past weeks to facilitating CDS application development and asking for professional input and enrichment from other counties.

## Aims

1. Develop and share openEHR archetypes and templates for COVID-19 diagnosis and treatment decision support.

2. Develop and share COVID-19 diagnosis and treatment knowledge in the form of GDL and Drools.

## Project layout

### GDL rules

The *archetypes* folder consists of the ADL files exported from HMC platform. The ADL files are also available in http://hmc.openehr.org.cn/#/archetype

The *GDL* folder consists of GDL rules written and exported by the GDL2 Editor.

### Drools rules

Despite the fact that GDL2 is a great language that enables sharing rule-based clinical knowledge, there are three reasons making us have to choose Drools as our actual execution language. Firstly, to the best of our knowledge, there is yet a lack of a dedicated execution engine for GDL2 publically available on the internet. Secondly, we did not manage to represent a time serial in GDL2 (e.g., last three NATs are all negative), which means additional rules for data pre-processing in other languages are required. Lastly, there is a gap between the output of GDL2 rules and the actual application's requirements.

Consequently, we translated the GDL2 rules to Drools rules and added data pre-processing rules and application-specific rules accordingly. *Currently, the translation is carried out manually as the mapping rule from GDL2 to Drools is rather straightforward. We are currently working on an automatic GDL2->Drools translator.*

The *DataModel* folder contains the Java data model used for the Drools rules.

The *Drools* folder contains the Drools rules translated from the GDL rules. Additional rules for data pre-processing and application are also provided.

## Instructions for using

### Download and configure GDL2 Editor

Detailed procedures can be found in https://gdl-lang.org/the-project/guides-tutorials/gdl2/running-the-gdl2-editor-with-docker/

### Import ADL and GDL rules

Import the openEHR archetypes and templates from *Guideline->Import Archetype/FHIR Profile*. The ADL file can be found in the above-mentioned folder or HMC.

Import the GDL rules from *Guideline->Load Guideline from File*.

### Modify the rules

Modify the rules with GDL2 Editor. A detailed user manual is available in https://cds-apps.com/archived-guides-and-tutorials/guideline-guide/

### Test with patient data

Click the *Execution* label to test the GDL rules. Test data can be found in the above-mentioned files.

### Export your own rules

Export the modified rule by *Guideline->Save guideline to a File*

## Demonstration application

The demo can be found in http://mcp-cdss.vico-lab.com/lst/#/

## Useful resources

Translation of the Chinese guideline: https://www.chinalawtranslate.com/en/coronavirus-treatment-plan-7/  
The HMC platform: http://hmc.openehr.org.cn/#/archetype  
GDL related resources: https://gdl-lang.org/  
GDL2 Editor Docker for Windows: https://store.docker.com/editions/community/docker-ce-desktop-windows  
GDL2 Editor Docker for Windows: https://store.docker.com/editions/community/docker-ce-desktop-mac

## Contributors

Researchers from Zhejiang University and engineers from Hangzhou Joyrun Medical Technology Cooperation and Hangzhou Vico Software Cooperation have contributed collaboratively to this piece of work.

### openEHR archetype and template modeling

Bin Qi (Hangzhou Joyrun Medical Technology Cooperation, China)  
Mengyang Li (Zhejiang University, China)

### Rule authoring

Shan Nan (Zhejiang University, China)  
Hongshuo Feng (Zhejiang University, China)  
Tianhua Tang (Zhejiang University, China)

### Demostration application R&D

Kuai Yu (Hangzhou Vico Software Cooperation, China)  
Shan Nan (Zhejiang University, China)  
Tianhua Tang (Zhejiang University, China)

### Clinical application

Bin Fu (Hangzhou Joyrun Medical Technology Cooperation, China)  
Hailing Cai (Hangzhou Joyrun Medical Technology Cooperation, China)  
Yijie Wang (Hangzhou Joyrun Medical Technology Cooperation, China)

### Project management

Xudong Lu (Zhejiang University, China)  

## Acknowledgement

We sincerely appreciate the critical review and suggestions given by  
Heather Leslie (Automica Informatics, Australia)  
Ian McNicoll (FreshEHR, UK)  
Bjørn Næss (DIPSASA, Norway)
