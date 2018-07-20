package com.android.nytimes.ws_models;

import com.android.nytimes.utils.LogUtils;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by N!K$ on 7/19/18.
 */

public class NewsModel implements Serializable{

    /**
     * status : OK
     * copyright : Copyright (c) 2018 The New York Times Company.  All Rights Reserved.
     * num_results : 1702
     * results : [{"url":"https://www.nytimes.com/2018/07/14/us/trump-walks-front-queen-elizabeth.html","adx_keywords":"Trump, Donald J;Elizabeth II, Queen of Great Britain;Customs, Etiquette and Manners","column":null,"section":"U.S.","byline":"By SARAH MERVOSH","type":"Article","title":"Trump Walks in Front of Queen Elizabeth, Causing Social Media Frenzy","abstract":"There was little sympathy online for President Trump after a faux pas while meeting with the queen.","published_date":"2018-07-14","source":"The New York Times","id":100000006007521,"asset_id":100000006007521,"views":1,"des_facet":["CUSTOMS, ETIQUETTE AND MANNERS"],"org_facet":"","per_facet":["TRUMP, DONALD J","ELIZABETH II, QUEEN OF GREAT BRITAIN"],"geo_facet":"","media":[{"type":"image","subtype":"photo","caption":"President Trump briefly walked ahead of Queen Elizabeth II during his visit to Windsor Castle on Friday.","copyright":"Pool photos by Richard Pohle","approved_for_syndication":0,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-articleInline.jpg","format":"Normal","height":158,"width":190},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-jumbo.jpg","format":"Jumbo","height":852,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-superJumbo.jpg","format":"superJumbo","height":1705,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/15/opinion/trump-russia-investigation-putin.html","adx_keywords":"Trump, Donald J;Russian Interference in 2016 US Elections and Ties to Trump Associates;Russia;Putin, Vladimir V;Presidential Election of 2016;Cyberwarfare and Defense;United States Politics and Government;United States International Relations;Special Prosecutors (Independent Counsel);Mueller, Robert S III","column":null,"section":"Opinion","byline":"By CHARLES M. BLOW","type":"Article","title":"Trump, Treasonous Traitor","abstract":"The president fails to protect the country from an ongoing attack. ","published_date":"2018-07-15","source":"The New York Times","id":100000006007499,"asset_id":100000006007499,"views":2,"des_facet":["RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","PRESIDENTIAL ELECTION OF 2016","CYBERWARFARE AND DEFENSE","UNITED STATES POLITICS AND GOVERNMENT"],"org_facet":["UNITED STATES INTERNATIONAL RELATIONS","SPECIAL PROSECUTORS (INDEPENDENT COUNSEL)"],"per_facet":["TRUMP, DONALD J","PUTIN, VLADIMIR V","MUELLER, ROBERT S III"],"geo_facet":["RUSSIA"],"media":[{"type":"image","subtype":"photo","caption":"President Donald Trump meets with President Vladimir Putin of Russia at the G-20 Summit, in Hamburg, Germany, in July 2017. ","copyright":"Evan Vucci/Associated Press","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-jumbo.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-superJumbo.jpg","format":"superJumbo","height":1366,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/15/opinion/15blow/merlin_141295227_4a3dc327-df42-41b8-9ad4-79614740ba3d-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/16/us/politics/trump-russia-indictment.html","adx_keywords":"Butina, Mariia;Russian Interference in 2016 US Elections and Ties to Trump Associates;Russia;Presidential Election of 2016;United States Politics and Government;Trump, Donald J;Putin, Vladimir V;Mueller, Robert S III","column":null,"section":"U.S.","byline":"By MATT APUZZO, KATIE BENNER and SHARON LaFRANIERE","type":"Article","title":"Mariia Butina, Who Sought \u2018Back Channel\u2019 Meeting for Trump and Putin, Is Charged as Russian Agent","abstract":"Ms. Butina was accused of trying to broker secret relationships with American politicians so Russia could influence American policies.","published_date":"2018-07-16","source":"The New York Times","id":100000006010215,"asset_id":100000006010215,"views":3,"des_facet":["RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","PRESIDENTIAL ELECTION OF 2016","UNITED STATES POLITICS AND GOVERNMENT"],"org_facet":"","per_facet":["BUTINA, MARIIA","TRUMP, DONALD J","PUTIN, VLADIMIR V","MUELLER, ROBERT S III"],"geo_facet":["RUSSIA"],"media":[{"type":"image","subtype":"photo","caption":"Mariia Butina in 2013 in Moscow. She was charged Monday with carrying out a secret Russian effort to influence American politics.","copyright":"Itar-Tass/Zuma Press","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-square320-v2.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-articleInline-v2.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-jumbo-v2.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-superJumbo-v2.jpg","format":"superJumbo","height":1060,"width":1589},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-square640-v2.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-mediumThreeByTwo210-v2.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-russian-print/17dc-russian-mediumThreeByTwo440-v2.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/11/sports/world-cup/england-vs-croatia.html","adx_keywords":"World Cup 2018 (Soccer);Soccer;Croatia;England","column":null,"section":"Sports","byline":"By RORY SMITH","type":"Article","title":"Croatia Digs Deeper, Burying England\u2019s World Cup Dreams","abstract":"Croatia, in their third straight game that went to extra time, rode its resiliency to a semifinal win and ended England\u2019s effervescent run in this tournament.","published_date":"2018-07-11","source":"The New York Times","id":100000006002116,"asset_id":100000006002116,"views":4,"des_facet":["WORLD CUP 2018 (SOCCER)","SOCCER"],"org_facet":"","per_facet":"","geo_facet":["CROATIA","ENGLAND"],"media":[{"type":"image","subtype":"photo","caption":"Croatia\u2019s defender Sime Vrsaljko celebrates past England\u2019s forward Marcus Rashford.","copyright":"Yuri Cortez/Agence France-Presse \u2014 Getty Images","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/12england-croatia16-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/12england-croatia16-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/merlin_141133908_e7f30dab-53e3-49bc-95e0-8f3f5ef0c794-articleInline.jpg","format":"Normal","height":135,"width":190},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/merlin_141133908_e7f30dab-53e3-49bc-95e0-8f3f5ef0c794-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/merlin_141133908_e7f30dab-53e3-49bc-95e0-8f3f5ef0c794-jumbo.jpg","format":"Jumbo","height":726,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/merlin_141133908_e7f30dab-53e3-49bc-95e0-8f3f5ef0c794-superJumbo.jpg","format":"superJumbo","height":1453,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/12england-croatia16-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/12england-croatia16-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/merlin_141133908_e7f30dab-53e3-49bc-95e0-8f3f5ef0c794-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/12/sports/12england-croatia16/merlin_141133908_e7f30dab-53e3-49bc-95e0-8f3f5ef0c794-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/10/well/the-power-of-positive-people.html","adx_keywords":"Exercise;Social Media;Diet and Nutrition;Weight;Friendship","column":null,"section":"Well","byline":"By TARA PARKER-POPE","type":"Article","title":"The Power of Positive People","abstract":"Are your friendships giving you a boost or bringing you down?","published_date":"2018-07-10","source":"The New York Times","id":100000005998448,"asset_id":100000005998448,"views":5,"des_facet":["EXERCISE","SOCIAL MEDIA","DIET AND NUTRITION","FRIENDSHIP"],"org_facet":["WEIGHT"],"per_facet":"","geo_facet":"","media":[{"type":"image","subtype":"photo","caption":"","copyright":"Lorraine Sorlet","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-square320-v3.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-thumbStandard-v3.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-articleInline-v3.jpg","format":"Normal","height":153,"width":190},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-sfSpan-v3.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-jumbo-v3.jpg","format":"Jumbo","height":825,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-superJumbo-v3.jpg","format":"superJumbo","height":1651,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-square640-v3.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-thumbLarge-v3.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-mediumThreeByTwo210-v3.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/17/autossell/17sci_positive/17sci_positive-mediumThreeByTwo440-v3.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/12/world/asia/thailand-cave-rescue-seals.html","adx_keywords":"Rescues;Caves and Caverns;Diving and Divers;Tham Luang Nang Non Cave (Thailand);Defense and Military Forces;United States Defense and Military Forces;Thailand;vis-photo","column":null,"section":"World","byline":"By HANNAH BEECH, RICHARD C. PADDOCK and MUKTITA SUHARTONO","type":"Article","title":"\u2018Still Can\u2019t Believe It Worked\u2019: The Story of the Thailand Cave Rescue","abstract":"It took plastic cocoons and anti-anxiety pills, bravery and providence to save the soccer team. \u201cSo many things could have gone wrong,\u201d said one official.","published_date":"2018-07-12","source":"The New York Times","id":100000006003842,"asset_id":100000006003842,"views":6,"des_facet":["CAVES AND CAVERNS","DEFENSE AND MILITARY FORCES","UNITED STATES DEFENSE AND MILITARY FORCES","VIS-PHOTO"],"org_facet":["RESCUES","DIVING AND DIVERS"],"per_facet":"","geo_facet":["THAM LUANG NANG NON CAVE (THAILAND)","THAILAND"],"media":[{"type":"image","subtype":"photo","caption":"Thai officers supervising the rescue mission at the Tham Luang Cave.","copyright":"Linh Pham/Getty Images","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/13thailand-reconstruct-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/13thailand-reconstruct-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/merlin_140419299_7e9261c6-4769-4347-be9d-e211a12a34a3-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/merlin_140419299_7e9261c6-4769-4347-be9d-e211a12a34a3-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/merlin_140419299_7e9261c6-4769-4347-be9d-e211a12a34a3-jumbo.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/merlin_140419299_7e9261c6-4769-4347-be9d-e211a12a34a3-superJumbo.jpg","format":"superJumbo","height":1365,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/13thailand-reconstruct-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/13thailand-reconstruct-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/merlin_140419299_7e9261c6-4769-4347-be9d-e211a12a34a3-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/13/world/13thailand-reconstruct/merlin_140419299_7e9261c6-4769-4347-be9d-e211a12a34a3-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/10/opinion/boris-johnson-resignation-brexit.html","adx_keywords":"Great Britain Withdrawal from EU (Brexit);Politics and Government;Legislatures and Parliaments;Referendums;Conservative Party (Great Britain);European Union;May, Theresa M;Johnson, Boris;Great Britain","column":null,"section":"Opinion","byline":"By JENNI RUSSELL","type":"Article","title":"Boris Johnson Has Ruined Britain","abstract":"\u201cHe knows that the verdict of history is about to come down on him \u2014 and bury him.\u201d ","published_date":"2018-07-10","source":"The New York Times","id":100000005999668,"asset_id":100000005999668,"views":7,"des_facet":["GREAT BRITAIN WITHDRAWAL FROM EU (BREXIT)","POLITICS AND GOVERNMENT","REFERENDUMS"],"org_facet":["LEGISLATURES AND PARLIAMENTS","CONSERVATIVE PARTY (GREAT BRITAIN)","EUROPEAN UNION"],"per_facet":["MAY, THERESA M","JOHNSON, BORIS"],"geo_facet":["GREAT BRITAIN"],"media":[{"type":"image","subtype":"photo","caption":"Boris Johnson speaking to the media in May. Mr. Johnson resigned his post as foreign secretary in protest against the latest plans for Brexit.Credit","copyright":"John Thys/Agence France-Presse \u2014 Getty Images","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/merlin_138196068_6f20a87a-349f-4691-9bf0-1fb588717854-articleInline.jpg","format":"Normal","height":128,"width":190},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/merlin_138196068_6f20a87a-349f-4691-9bf0-1fb588717854-jumbo.jpg","format":"Jumbo","height":692,"width":1024},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/merlin_138196068_6f20a87a-349f-4691-9bf0-1fb588717854-superJumbo.jpg","format":"superJumbo","height":1383,"width":2048},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/08/09/opinion/09russellSub/09russellSub-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/16/world/europe/trump-putin-summit-helsinki.html","adx_keywords":"Trump, Donald J;Putin, Vladimir V;Russia;United States;United States International Relations;Russian Interference in 2016 US Elections and Ties to Trump Associates;Ukraine;Presidential Election of 2016","column":"","section":"World","byline":"By THE NEW YORK TIMES","type":"Article","title":"Trump-Putin Summit Is Over. The Head-Scratching? Not So Much","abstract":"President Trump has ended his weeklong trip to Europe.","published_date":"2018-07-16","source":"The New York Times","id":100000006007954,"asset_id":100000006007954,"views":8,"des_facet":["UNITED STATES INTERNATIONAL RELATIONS","RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","PRESIDENTIAL ELECTION OF 2016"],"org_facet":"","per_facet":["TRUMP, DONALD J","PUTIN, VLADIMIR V"],"geo_facet":["RUSSIA","UNITED STATES","UKRAINE"],"media":[{"type":"image","subtype":"photo","caption":"","copyright":"Doug Mills/The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/merlin_141372279_e316599a-17f0-4721-b5bd-11e5cda99c47-articleInline.jpg","format":"Normal","height":130,"width":190},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/merlin_141372279_e316599a-17f0-4721-b5bd-11e5cda99c47-jumbo.jpg","format":"Jumbo","height":701,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/merlin_141372279_e316599a-17f0-4721-b5bd-11e5cda99c47-superJumbo.jpg","format":"superJumbo","height":1402,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/17/world/17Trump-live14/17Trump-live14-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/13/us/politics/mueller-indictment-russian-intelligence-hacking.html","adx_keywords":"Russian Interference in 2016 US Elections and Ties to Trump Associates;Rosenstein, Rod J;Justice Department;Mueller, Robert S III;Special Prosecutors (Independent Counsel);Democratic Party;Presidential Election of 2016;Trump, Donald J;United States Politics and Government;Cyberwarfare and Defense;Russia","column":null,"section":"U.S.","byline":"By MARK MAZZETTI and KATIE BENNER","type":"Article","title":"12 Russian Agents Indicted in Mueller Investigation","abstract":"The intelligence officers were charged with hacking Democrats during the 2016 campaign. The indictment was announced days before President Trump is to meet with President Vladimir V. Putin of Russia.","published_date":"2018-07-13","source":"The New York Times","id":100000006006246,"asset_id":100000006006246,"views":9,"des_facet":["RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","SPECIAL PROSECUTORS (INDEPENDENT COUNSEL)","PRESIDENTIAL ELECTION OF 2016","UNITED STATES POLITICS AND GOVERNMENT","CYBERWARFARE AND DEFENSE"],"org_facet":["JUSTICE DEPARTMENT","DEMOCRATIC PARTY"],"per_facet":["ROSENSTEIN, ROD J","MUELLER, ROBERT S III","TRUMP, DONALD J"],"geo_facet":["RUSSIA"],"media":[{"type":"image","subtype":"photo","caption":"Deputy Attorney General Rod Rosenstein announcing indictments that are the most detailed accusation so far of Russian interference in the 2016 election.","copyright":"T.J. Kirkpatrick for The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/14dc-justice-print-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/14dc-justice-print-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/merlin_141217497_614f3da0-36c7-423d-bae3-e71e3a5151ca-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/14dc-justice-print-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/merlin_141217497_614f3da0-36c7-423d-bae3-e71e3a5151ca-jumbo.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/merlin_141217497_614f3da0-36c7-423d-bae3-e71e3a5151ca-superJumbo.jpg","format":"superJumbo","height":1365,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/14dc-justice-print-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/14dc-justice-print-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/merlin_141217497_614f3da0-36c7-423d-bae3-e71e3a5151ca-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/14/us/14dc-justice-print/merlin_141217497_614f3da0-36c7-423d-bae3-e71e3a5151ca-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/17/world/europe/trump-putin-summit.html","adx_keywords":"Trump, Donald J;Russian Interference in 2016 US Elections and Ties to Trump Associates;Russia;Putin, Vladimir V;United States Politics and Government;United States International Relations;Espionage and Intelligence Services","column":null,"section":"World","byline":"By MARK LANDLER and MAGGIE HABERMAN","type":"Article","title":"A Besieged Trump Says He Misspoke on Russian Election Meddling","abstract":"President Trump was widely criticized, including by many in his own party, for what was viewed as unprecedented deference to President Vladimir V. Putin on Monday.","published_date":"2018-07-17","source":"The New York Times","id":100000006011700,"asset_id":100000006011700,"views":10,"des_facet":["RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","UNITED STATES POLITICS AND GOVERNMENT","UNITED STATES INTERNATIONAL RELATIONS"],"org_facet":["ESPIONAGE AND INTELLIGENCE SERVICES"],"per_facet":["TRUMP, DONALD J","PUTIN, VLADIMIR V"],"geo_facet":["RUSSIA"],"media":[{"type":"image","subtype":"photo","caption":"President Trump spoke with members of Congress at the White House on Tuesday.","copyright":"Tom Brenner for The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-square320-v5.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-thumbStandard-v6.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-articleInline-v5.jpg","format":"Normal","height":142,"width":190},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-sfSpan-v7.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-jumbo-v7.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-superJumbo-v7.jpg","format":"superJumbo","height":1365,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-square640-v5.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-thumbLarge-v6.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-mediumThreeByTwo210-v7.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/17/us/18PREXY-alpha/18PREXY-alpha-mediumThreeByTwo440-v7.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/12/us/politics/fbi-agent-house-republicans.html","adx_keywords":"Strzok, Peter;Federal Bureau of Investigation;House of Representatives;Republican Party;United States Politics and Government;Russian Interference in 2016 US Elections and Ties to Trump Associates;Special Prosecutors (Independent Counsel);Page, Lisa (1979- );Trump, Donald J;Presidential Election of 2016","column":null,"section":"U.S.","byline":"By NICHOLAS FANDOS","type":"Article","title":"F.B.I. Agent Defends Actions in Russia Inquiry in Contentious House Testimony","abstract":"Peter Strzok, the F.B.I. agent who led the investigations of Russian interference and the Clinton emails, was hauled before the House but came out swinging.","published_date":"2018-07-12","source":"The New York Times","id":100000006004162,"asset_id":100000006004162,"views":11,"des_facet":["UNITED STATES POLITICS AND GOVERNMENT","RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","PRESIDENTIAL ELECTION OF 2016"],"org_facet":["FEDERAL BUREAU OF INVESTIGATION","HOUSE OF REPRESENTATIVES","REPUBLICAN PARTY","SPECIAL PROSECUTORS (INDEPENDENT COUNSEL)"],"per_facet":["STRZOK, PETER","PAGE, LISA (1979- )","TRUMP, DONALD J"],"geo_facet":"","media":[{"type":"image","subtype":"photo","caption":"Peter Strzok, the F.B.I. deputy assistant director, arrived to testify before the House Committees on the Judiciary and Oversight &amp; Government Reform on Thursday.","copyright":"Erin Schaff for The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/merlin_141171009_030bde84-3ab2-472c-b99c-022ba529d1be-articleInline.jpg","format":"Normal","height":132,"width":190},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/merlin_141171009_030bde84-3ab2-472c-b99c-022ba529d1be-jumbo.jpg","format":"Jumbo","height":712,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/merlin_141171009_030bde84-3ab2-472c-b99c-022ba529d1be-superJumbo.jpg","format":"superJumbo","height":1424,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/13/us/politics/13dc-fbi2/13dc-fbi2-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/15/us/politics/iran-israel-mossad-nuclear.html","adx_keywords":"Nuclear Weapons;Arms Control and Limitation and Disarmament;Espionage and Intelligence Services;Mossad;Tehran (Iran);Israel;Iran","column":null,"section":"U.S.","byline":"By DAVID E. SANGER and RONEN BERGMAN","type":"Article","title":"How Israel, in Dark of Night, Torched Its Way to Iran\u2019s Nuclear Secrets","abstract":"The Israeli government showed three reporters, including one from The Times, documents indicating that the Iranian nuclear weapons program was larger and more sophisticated than once suspected.","published_date":"2018-07-15","source":"The New York Times","id":100000006008362,"asset_id":100000006008362,"views":12,"des_facet":["NUCLEAR WEAPONS","ARMS CONTROL AND LIMITATION AND DISARMAMENT"],"org_facet":["ESPIONAGE AND INTELLIGENCE SERVICES","MOSSAD"],"per_facet":"","geo_facet":["TEHRAN (IRAN)","ISRAEL","IRAN"],"media":[{"type":"image","subtype":"photo","caption":"Photographs that Israeli officials said were stolen from Iran&rsquo;s nuclear archive appear to show a giant metal chamber, in a building at the Parchin military site, built to conduct high-explosive experiments.","copyright":"Mossad","approved_for_syndication":0,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/16iran1_dc-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/16iran1_dc-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/merlin_141220983_e927d027-7ecf-403e-8c56-1f25d19bd11d-articleInline.jpg","format":"Normal","height":122,"width":190},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/16iran1_dc-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/merlin_141220983_e927d027-7ecf-403e-8c56-1f25d19bd11d-jumbo.jpg","format":"Jumbo","height":498,"width":773},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/merlin_141220983_e927d027-7ecf-403e-8c56-1f25d19bd11d-superJumbo.jpg","format":"superJumbo","height":498,"width":773},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/16iran1_dc-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/16iran1_dc-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/16/us/16iran1_dc/16iran1_dc-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/08/health/world-health-breastfeeding-ecuador-trump.html","adx_keywords":"Breastfeeding;Infant Formulas;United States International Relations;World Health Organization;Health and Human Services Department;State Department;Ecuador","column":null,"section":"Health","byline":"By ANDREW JACOBS","type":"Article","title":"Opposition to Breast-Feeding Resolution by U.S. Stuns World Health Officials","abstract":"Trade sanctions. Withdrawal of military aid. The Trump administration used both to try to block a measure that was considered uncontroversial and embraced by countries around the world.","published_date":"2018-07-08","source":"The New York Times","id":100000005955815,"asset_id":100000005955815,"views":13,"des_facet":["UNITED STATES INTERNATIONAL RELATIONS"],"org_facet":["BREASTFEEDING","INFANT FORMULAS","WORLD HEALTH ORGANIZATION","HEALTH AND HUMAN SERVICES DEPARTMENT","STATE DEPARTMENT"],"per_facet":"","geo_facet":["ECUADOR"],"media":[{"type":"image","subtype":"photo","caption":"A Brooklyn mother unable to nurse fed her child donated breast milk. The $70 billion infant formula industry has seen sales flatten in wealthy countries in recent years.","copyright":"James Estrin/The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-jumbo.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-superJumbo.jpg","format":"superJumbo","height":1365,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/09/business/09breastfeeding-1-sub-2/merlin_74866264_0e99440c-95bc-40f5-8b74-c30bc48e93e4-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/16/health/fda-blood-pressure-valsartan.html","adx_keywords":"Drugs (Pharmaceuticals);Recalls and Bans of Products;Food and Drug Administration;China;Blood Pressure;valsartan;Teva Pharmaceutical Industries Ltd;Zhejiang Huahai Pharmaceutical Co Ltd;Major Pharmaceuticals Inc;Solco Healthcare","column":null,"section":"Health","byline":"By SHEILA KAPLAN","type":"Article","title":"Blood Pressure Medicine Is Recalled","abstract":"The F.D.A. announced that batches of a widely used generic drug, valsartan, made in China, might be tainted with a probable cancer-causing ingredient.","published_date":"2018-07-16","source":"The New York Times","id":100000006010314,"asset_id":100000006010314,"views":14,"des_facet":["DRUGS (PHARMACEUTICALS)","RECALLS AND BANS OF PRODUCTS","BLOOD PRESSURE"],"org_facet":["FOOD AND DRUG ADMINISTRATION","TEVA PHARMACEUTICAL INDUSTRIES LTD","ZHEJIANG HUAHAI PHARMACEUTICAL CO LTD","MAJOR PHARMACEUTICALS INC","SOLCO HEALTHCARE"],"per_facet":"","geo_facet":["CHINA"],"media":[{"type":"image","subtype":"photo","caption":"Batches of the drug valsartan were recalled because of possible contaminants.","copyright":"Science Source","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/merlin_141384801_06b22dc7-1868-4d47-9c17-7b5d080739a4-jumbo.jpg","format":"Jumbo","height":685,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/merlin_141384801_06b22dc7-1868-4d47-9c17-7b5d080739a4-superJumbo.jpg","format":"superJumbo","height":1371,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/17/science/17RECALL/17RECALL-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/16/opinion/trump-and-putin-vs-america.html","adx_keywords":"Trump, Donald J;Putin, Vladimir V;Russian Interference in 2016 US Elections and Ties to Trump Associates;Cyberwarfare and Defense;United States International Relations;Federal Bureau of Investigation;Central Intelligence Agency;National Security Agency;Russia","column":"Op-Ed Columnist","section":"Opinion","byline":"By THOMAS L. FRIEDMAN","type":"Article","title":"Trump and Putin vs. America","abstract":"The president\u2019s refusal to condemn Russian attacks is a betrayal of every single American citizen.","published_date":"2018-07-16","source":"The New York Times","id":100000006009993,"asset_id":100000006009993,"views":15,"des_facet":["RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","CYBERWARFARE AND DEFENSE","UNITED STATES INTERNATIONAL RELATIONS"],"org_facet":["FEDERAL BUREAU OF INVESTIGATION","CENTRAL INTELLIGENCE AGENCY","NATIONAL SECURITY AGENCY"],"per_facet":["TRUMP, DONALD J","PUTIN, VLADIMIR V"],"geo_facet":["RUSSIA"],"media":[{"type":"image","subtype":"photo","caption":"President Donald Trump with President Vladimir Putin during a joint news conference in Helsinki on Monday.","copyright":"Doug Mills/The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-articleInline.jpg","format":"Normal","height":130,"width":190},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-jumbo.jpg","format":"Jumbo","height":701,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-superJumbo.jpg","format":"superJumbo","height":1402,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/16/opinion/16friedmanWeb/16friedmanWeb-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/16/us/politics/republicans-trump-putin.html","adx_keywords":"Putin, Vladimir V;Trump, Donald J;Russian Interference in 2016 US Elections and Ties to Trump Associates;Republican Party;Russia;United States International Relations;Democratic Party;United States Politics and Government","column":null,"section":"U.S.","byline":"By SHERYL GAY STOLBERG, NICHOLAS FANDOS and THOMAS KAPLAN","type":"Article","title":"Republicans Rebuke Trump for Siding With Putin as Democrats Demand Action","abstract":"No Republican in Congress, however, pledged any particular action to punish President Trump, such as holding up his nominees, nor did any promise hearings or increased oversight.","published_date":"2018-07-16","source":"The New York Times","id":100000006010090,"asset_id":100000006010090,"views":16,"des_facet":["RUSSIAN INTERFERENCE IN 2016 US ELECTIONS AND TIES TO TRUMP ASSOCIATES","UNITED STATES INTERNATIONAL RELATIONS","UNITED STATES POLITICS AND GOVERNMENT"],"org_facet":["REPUBLICAN PARTY","DEMOCRATIC PARTY"],"per_facet":["PUTIN, VLADIMIR V","TRUMP, DONALD J"],"geo_facet":["RUSSIA"],"media":[{"type":"image","subtype":"photo","caption":"Senator Mitch McConnell, Republican of Kentucky and the majority leader, said that &ldquo;the Russians are not our friends,&rdquo; after President Trump&rsquo;s joint news conference on Monday with President Vladimir V. Putin of Russia.","copyright":"Erin Schaff for The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/17dc-cong-sub1-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/17dc-cong-sub1-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/merlin_141381342_0c9be841-ff98-4ef0-820c-40e3138fd453-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/merlin_141381342_0c9be841-ff98-4ef0-820c-40e3138fd453-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/merlin_141381342_0c9be841-ff98-4ef0-820c-40e3138fd453-jumbo.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/merlin_141381342_0c9be841-ff98-4ef0-820c-40e3138fd453-superJumbo.jpg","format":"superJumbo","height":1366,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/17dc-cong-sub1-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/17dc-cong-sub1-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/merlin_141381342_0c9be841-ff98-4ef0-820c-40e3138fd453-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/17/us/politics/17dc-cong-print/merlin_141381342_0c9be841-ff98-4ef0-820c-40e3138fd453-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/15/us/politics/democratic-presidential-candidates-2020.html","adx_keywords":"Midterm Elections (2018);Presidential Election of 2020;Warren, Elizabeth;Biden, Joseph R Jr;Booker, Cory A;Harris, Kamala D;Sanders, Bernard;Trump, Donald J;Democratic Party","column":null,"section":"U.S.","byline":"By ALEXANDER BURNS and JONATHAN MARTIN","type":"Article","title":"Warren Is Preparing for 2020. So Are Biden, Booker, Harris and Sanders.","abstract":"As many top Democrats eye a run for president in 2020, Elizabeth Warren has all but announced her candidacy, while Joe Biden is planning to campaign up to four days a week this fall for midterm candidates.","published_date":"2018-07-15","source":"The New York Times","id":100000005995818,"asset_id":100000005995818,"views":17,"des_facet":["MIDTERM ELECTIONS (2018)","PRESIDENTIAL ELECTION OF 2020"],"org_facet":["DEMOCRATIC PARTY"],"per_facet":["WARREN, ELIZABETH","BIDEN, JOSEPH R JR","BOOKER, CORY A","HARRIS, KAMALA D","SANDERS, BERNARD","TRUMP, DONALD J"],"geo_facet":"","media":[{"type":"image","subtype":"photo","caption":"Senator Kamala Harris of California spoke after a news conference outside the Supreme Court denouncing President Trump's nominee to fill a vacancy.","copyright":"Erin Schaff for The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/00DEMS2020-4-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/00DEMS2020-4-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/merlin_141048450_040bf390-4181-4b27-a807-2344452345c4-articleInline.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/merlin_141048450_040bf390-4181-4b27-a807-2344452345c4-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/merlin_141048450_040bf390-4181-4b27-a807-2344452345c4-jumbo.jpg","format":"Jumbo","height":683,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/merlin_141048450_040bf390-4181-4b27-a807-2344452345c4-superJumbo.jpg","format":"superJumbo","height":1366,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/00DEMS2020-4-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/00DEMS2020-4-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/merlin_141048450_040bf390-4181-4b27-a807-2344452345c4-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/16/us/politics/16-jp-dems-1/merlin_141048450_040bf390-4181-4b27-a807-2344452345c4-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/14/us/migrant-children-shelters.html","adx_keywords":"Children and Childhood;Immigration Detention;Illegal Immigration;Trump, Donald J;United States Politics and Government","column":null,"section":"U.S.","byline":"By DAN BARRY, MIRIAM JORDAN, ANNIE CORREAL and MANNY FERNANDEZ","type":"Article","title":"Cleaning Toilets, Following Rules: A Migrant Child\u2019s Days in Detention","abstract":"A portrait of life in the shelters for the children detained after crossing the U.S.-Mexico border.","published_date":"2018-07-14","source":"The New York Times","id":100000005995409,"asset_id":100000005995409,"views":18,"des_facet":["ILLEGAL IMMIGRATION"],"org_facet":["CHILDREN AND CHILDHOOD","IMMIGRATION DETENTION","UNITED STATES POLITICS AND GOVERNMENT"],"per_facet":["TRUMP, DONALD J"],"geo_facet":"","media":[{"type":"image","subtype":"photo","caption":"Adan Galicia Lopez, 3, was separated from his mother for four months.","copyright":"Victor J. Blue for The New York Times","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-square320-v2.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-thumbStandard-v2.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-articleInline-v3.jpg","format":"Normal","height":127,"width":190},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-sfSpan-v3.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-jumbo-v3.jpg","format":"Jumbo","height":1024,"width":832},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-superJumbo-v3.jpg","format":"superJumbo","height":2048,"width":1663},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-square640-v2.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-thumbLarge-v2.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-mediumThreeByTwo210-v3.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/15/us/15kidshelters-p1-alpha/15kidshelters-p1-alpha-mediumThreeByTwo440-v3.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/16/style/melania-trump-europe-wardrobe.html","adx_keywords":"Fashion and Apparel;First Ladies (US);Trump, Melania","column":"Unbuttoned","section":"Style","byline":"By VANESSA FRIEDMAN","type":"Article","title":"Melania Trump\u2019s Wardrobe Goes Mute","abstract":"After the jacket controversy, the first lady dressed for discretion as she accompanied her husband on his European trip.","published_date":"2018-07-16","source":"The New York Times","id":100000006009823,"asset_id":100000006009823,"views":19,"des_facet":["FASHION AND APPAREL"],"org_facet":["FIRST LADIES (US)"],"per_facet":["TRUMP, MELANIA"],"geo_facet":"","media":[{"type":"image","subtype":"photo","caption":"","copyright":"Pool photo by Luca Bruno","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-articleInline.jpg","format":"Normal","height":141,"width":190},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-jumbo.jpg","format":"Jumbo","height":760,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-superJumbo.jpg","format":"superJumbo","height":1520,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/19/fashion/19UNBUTTONED-europetrip-slide-A6YJ/19UNBUTTONED-europetrip-slide-A6YJ-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]},{"url":"https://www.nytimes.com/2018/07/15/sports/world-cup/france-vs-croatia-final.html","adx_keywords":"Soccer;World Cup 2018 (Soccer);France;Croatia","column":null,"section":"Sports","byline":"By ANDREW DAS","type":"Article","title":"How France Won Its Second World Cup Title","abstract":"Led by Kylian Mbappé and Paul Pogba, France brings home its second World Cup trophy, 20 years after winning its first.","published_date":"2018-07-15","source":"The New York Times","id":100000006008383,"asset_id":100000006008383,"views":20,"des_facet":["WORLD CUP 2018 (SOCCER)"],"org_facet":["SOCCER"],"per_facet":"","geo_facet":["FRANCE","CROATIA"],"media":[{"type":"image","subtype":"photo","caption":"France celebrates after Paul Pogba scored in the second half.","copyright":"Martin Meissner/Associated Press","approved_for_syndication":1,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/16worldcup-final-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/16worldcup-final-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/merlin_141319968_1e877350-5527-4e55-81d1-2e7dadc8c5a6-articleInline.jpg","format":"Normal","height":132,"width":190},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/merlin_141319968_1e877350-5527-4e55-81d1-2e7dadc8c5a6-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/merlin_141319968_1e877350-5527-4e55-81d1-2e7dadc8c5a6-jumbo.jpg","format":"Jumbo","height":709,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/merlin_141319968_1e877350-5527-4e55-81d1-2e7dadc8c5a6-superJumbo.jpg","format":"superJumbo","height":1418,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/16worldcup-final-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/16worldcup-final-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/merlin_141319968_1e877350-5527-4e55-81d1-2e7dadc8c5a6-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/16/sports/16worldcup-final/merlin_141319968_1e877350-5527-4e55-81d1-2e7dadc8c5a6-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]}]
     */

    private String status;
    private String copyright;
    private int num_results;
    private List<ResultsBean> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean implements Serializable{
        /**
         * url : https://www.nytimes.com/2018/07/14/us/trump-walks-front-queen-elizabeth.html
         * adx_keywords : Trump, Donald J;Elizabeth II, Queen of Great Britain;Customs, Etiquette and Manners
         * column : null
         * section : U.S.
         * byline : By SARAH MERVOSH
         * type : Article
         * title : Trump Walks in Front of Queen Elizabeth, Causing Social Media Frenzy
         * abstract : There was little sympathy online for President Trump after a faux pas while meeting with the queen.
         * published_date : 2018-07-14
         * source : The New York Times
         * id : 100000006007521
         * asset_id : 100000006007521
         * views : 1
         * des_facet : ["CUSTOMS, ETIQUETTE AND MANNERS"]
         * org_facet :
         * per_facet : ["TRUMP, DONALD J","ELIZABETH II, QUEEN OF GREAT BRITAIN"]
         * geo_facet :
         * media : [{"type":"image","subtype":"photo","caption":"President Trump briefly walked ahead of Queen Elizabeth II during his visit to Windsor Castle on Friday.","copyright":"Pool photos by Richard Pohle","approved_for_syndication":0,"media-metadata":[{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-articleInline.jpg","format":"Normal","height":158,"width":190},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-jumbo.jpg","format":"Jumbo","height":852,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-superJumbo.jpg","format":"superJumbo","height":1705,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]}]
         */

        private String url;
        private String adx_keywords;
        private Object column;
        private String section;
        private String byline;
        private String type;
        private String title;

        @SerializedName("abstract")
        private String abstractNewsData;

        private String abstractX;
        private String published_date;
        private String source;
        private long id;
        private long asset_id;
        private int views;


        private Object org_facet;
        private String org_facetStr;
        private List<String> org_facetList;


        private Object des_facet;
        private String des_facetStr;
        private List<String> des_facetList;


        private Object per_facet;
        private String per_facetStr;
        private List<String> per_facetList;

        public String getAbstractNewsData() {
            return abstractNewsData;
        }

        public void setAbstractNewsData(String abstractNewsData) {
            this.abstractNewsData = abstractNewsData;
        }

        private List<MediaBean> media;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAdx_keywords() {
            return adx_keywords;
        }

        public void setAdx_keywords(String adx_keywords) {
            this.adx_keywords = adx_keywords;
        }

        public Object getColumn() {
            return column;
        }

        public void setColumn(Object column) {
            this.column = column;
        }

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public String getByline() {
            return byline;
        }

        public void setByline(String byline) {
            this.byline = byline;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getPublished_date() {
            return published_date;
        }

        public void setPublished_date(String published_date) {
            this.published_date = published_date;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getAsset_id() {
            return asset_id;
        }

        public void setAsset_id(long asset_id) {
            this.asset_id = asset_id;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public Object getOrg_facet() {
            return org_facet;
        }

        public void setOrg_facet(Object org_facet) {
            if (org_facet != null && org_facet.toString().length() == 0) {
                setOrg_facetStr("NA");
            } else if (org_facet != null && org_facet.toString().trim().length() > 0) {
                List<String> stringList = new ArrayList<>(Arrays.asList(org_facet.toString()));
                setOrg_facetList(stringList);
            }
            else
                this.org_facet = org_facet;
        }

        public String getOrg_facetStr() {
            return org_facetStr;
        }

        public void setOrg_facetStr(String org_facetStr) {
            this.org_facetStr = org_facetStr;
        }

        public List<String> getOrg_facetList() {
            return org_facetList;
        }

        public Object getDes_facet() {
            return des_facet;
        }

        public void setDes_facet(Object des_facet) {
            if (des_facet != null && des_facet.toString().trim().length() == 0){
                setDes_facetStr("NA");
            }
            else if (des_facet != null && des_facet.toString().trim().length() > 1){
                List<String> stringList = new ArrayList<>(Arrays.asList(des_facet.toString()));
                setDes_facetList(stringList);
            }
            else
                this.des_facet = des_facet;
        }

        public String getDes_facetStr() {
            return des_facetStr;
        }

        public void setDes_facetStr(String des_facetStr) {
            this.des_facetStr = des_facetStr;
        }

        public List<String> getDes_facetList() {
            return des_facetList;
        }

        public void setDes_facetList(List<String> des_facetList) {
            this.des_facetList = des_facetList;
        }

        public Object getPer_facet() {
            return per_facet;
        }

        public void setPer_facet(Object per_facet) {
            if (per_facet != null && per_facet.toString().trim().length() == 0){
                setPer_facetStr("NA");
            }
            else if (per_facet != null && per_facet.toString().trim().length() > 0){
                List<String> stringList = new ArrayList<>(Arrays.asList(per_facet.toString()));
                setPer_facetList(stringList);
            }
            else
                this.per_facet = per_facet;
        }

        public String getPer_facetStr() {
            return per_facetStr;
        }

        public void setPer_facetStr(String per_facetStr) {
            this.per_facetStr = per_facetStr;
        }

        public List<String> getPer_facetList() {
            return per_facetList;
        }

        public void setPer_facetList(List<String> per_facetList) {
            this.per_facetList = per_facetList;
        }

        public void setOrg_facetList(List<String> org_facetList) {
            this.org_facetList = org_facetList;
        }

        public void setPer_facet(List<String> per_facet) {
            this.per_facet = per_facet;
        }

        public List<MediaBean> getMedia() {
            return media;
        }

        public void setMedia(List<MediaBean> media) {
            this.media = media;
        }

        public static class MediaBean implements Serializable{
            /**
             * type : image
             * subtype : photo
             * caption : President Trump briefly walked ahead of Queen Elizabeth II during his visit to Windsor Castle on Friday.
             * copyright : Pool photos by Richard Pohle
             * approved_for_syndication : 0
             * media-metadata : [{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square320.jpg","format":"square320","height":320,"width":320},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-thumbStandard.jpg","format":"Standard Thumbnail","height":75,"width":75},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-articleInline.jpg","format":"Normal","height":158,"width":190},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-sfSpan.jpg","format":"Large","height":263,"width":395},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-jumbo.jpg","format":"Jumbo","height":852,"width":1024},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-superJumbo.jpg","format":"superJumbo","height":1705,"width":2048},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square640.jpg","format":"square640","height":640,"width":640},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-thumbLarge.jpg","format":"Large Thumbnail","height":150,"width":150},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-mediumThreeByTwo210.jpg","format":"mediumThreeByTwo210","height":140,"width":210},{"url":"https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-mediumThreeByTwo440.jpg","format":"mediumThreeByTwo440","height":293,"width":440}]
             */

            private String type;
            private String subtype;
            private String caption;
            private String copyright;
            private int approved_for_syndication;
            @SerializedName("media-metadata")
            private List<MediametadataBean> mediametadata;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSubtype() {
                return subtype;
            }

            public void setSubtype(String subtype) {
                this.subtype = subtype;
            }

            public String getCaption() {
                return caption;
            }

            public void setCaption(String caption) {
                this.caption = caption;
            }

            public String getCopyright() {
                return copyright;
            }

            public void setCopyright(String copyright) {
                this.copyright = copyright;
            }

            public int getApproved_for_syndication() {
                return approved_for_syndication;
            }

            public void setApproved_for_syndication(int approved_for_syndication) {
                this.approved_for_syndication = approved_for_syndication;
            }

            public List<MediametadataBean> getMediametadata() {
                return mediametadata;
            }

            public void setMediametadata(List<MediametadataBean> mediametadata) {
                this.mediametadata = mediametadata;
            }

            public static class MediametadataBean implements Serializable{
                /**
                 * url : https://static01.nyt.com/images/2018/07/14/world/14XPQUEEN_COMBO/14XPQUEEN_COMBO-square320.jpg
                 * format : square320
                 * height : 320
                 * width : 320
                 */

                private String url;
                private String format;
                private int height;
                private int width;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getFormat() {
                    return format;
                }

                public void setFormat(String format) {
                    this.format = format;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }
            }
        }
    }
}
