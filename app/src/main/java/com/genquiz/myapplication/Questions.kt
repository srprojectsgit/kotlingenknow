package com.genquiz.myapplication

import java.util.*
import kotlin.collections.ArrayList

class Questions {


    val questionsAndAnswers = Array(500){Array(5){""} }

    init{

        questionsAndAnswers[0][0] = "What is the capital of Columbia?";
        questionsAndAnswers[0][1] = "Bogota";
        questionsAndAnswers[0][2] = "La Paz";
        questionsAndAnswers[0][3] = "Helsinki";
        questionsAndAnswers[0][4] = "Lima";

        questionsAndAnswers[1][0] = "Which method of heat transfer best describes a lava lamp?";
        questionsAndAnswers[1][1] = "Convection";
        questionsAndAnswers[1][2] = "Condensation";
        questionsAndAnswers[1][3] = "Radiation";
        questionsAndAnswers[1][4] = "Conduction";

        questionsAndAnswers[2][0] = "Which Artist is best known for painting his mother?";
        questionsAndAnswers[2][1] = "James Whistler";
        questionsAndAnswers[2][2] = "Francisco Goya";
        questionsAndAnswers[2][3] = "Pierre Auguste Renoir";
        questionsAndAnswers[2][4] = "Johannes Vermeer";

        questionsAndAnswers[3][0] = "What is the longest old English poem?";
        questionsAndAnswers[3][1] = "Beowulf";
        questionsAndAnswers[3][2] = "Laymon";
        questionsAndAnswers[3][3] = "Songs of Innocence";
        questionsAndAnswers[3][4] = "Spoon River Analogy";

        questionsAndAnswers[4][0] = "Which of these poets did not use capital letters in his work?";
        questionsAndAnswers[4][1] = "E.E Cummings";
        questionsAndAnswers[4][2] = "Robert Browning";
        questionsAndAnswers[4][3] = "John Keats";
        questionsAndAnswers[4][4] = "William Wordsworth";

        questionsAndAnswers[5][0] = "What did common beam refer to?";
        questionsAndAnswers[5][1] = "An official device for weighing";
        questionsAndAnswers[5][2] = "A plank of wood";
        questionsAndAnswers[5][3] = "A porridge";
        questionsAndAnswers[5][4] = "A particle of sunlight";

        questionsAndAnswers[6][0] = "In which war did the Battle of Goose Green take place?";
        questionsAndAnswers[6][1] = "Falklands War";
        questionsAndAnswers[6][2] = "Crimean War";
        questionsAndAnswers[6][3] = "Seven Years War";
        questionsAndAnswers[6][4] = "War of the Roses";

        questionsAndAnswers[7][0] = "What name was given to the males in Queen Cleopatra's family?";
        questionsAndAnswers[7][1] = "Ptolemy";
        questionsAndAnswers[7][2] = "Nero";
        questionsAndAnswers[7][3] = "Ramses";
        questionsAndAnswers[7][4] = "Neheb";

        questionsAndAnswers[8][0] = "In which war did the battle of Bunker Hill take place?";
        questionsAndAnswers[8][1] = "American War of Independence";
        questionsAndAnswers[8][2] = "100 Years War";
        questionsAndAnswers[8][3] = "World War 2";
        questionsAndAnswers[8][4] = "War of the Roses";

        questionsAndAnswers[9][0] = "Which Three Musketeers character has a sash that was given to him by The Queen?";
        questionsAndAnswers[9][1] = "Porthos";
        questionsAndAnswers[9][2] = "Aramis";
        questionsAndAnswers[9][3] = "Athos";
        questionsAndAnswers[9][4] = "D' Artagnan";

        questionsAndAnswers[10][0] = "Twenty Years After is the sequel to what novel?";
        questionsAndAnswers[10][1] = "The Three Musketeers";
        questionsAndAnswers[10][2] = "Death of a Salesman";
        questionsAndAnswers[10][3] = "The Life of Pi";
        questionsAndAnswers[10][4] = "The Catcher in the Rye";

        questionsAndAnswers[11][0] = "Which goddess was obliged to spend part of every year in the underworld because Hades tricked her into eating pomegranate seeds?";
        questionsAndAnswers[11][1] = "Persephone";
        questionsAndAnswers[11][2] = "Demeter";
        questionsAndAnswers[11][3] = "Calliope";
        questionsAndAnswers[11][4] = "Aphrodite";

        questionsAndAnswers[12][0] = "Which Greek goddess was the goddess of grain and agriculture?";
        questionsAndAnswers[12][1] = "Demeter";
        questionsAndAnswers[12][2] = "Artemis";
        questionsAndAnswers[12][3] = "Persephone";
        questionsAndAnswers[12][4] = "Athena";

        questionsAndAnswers[13][0] = "Who portrayed Frankenstein's monster in the 1931 film?";
        questionsAndAnswers[13][1] = "Boris Karloff";
        questionsAndAnswers[13][2] = "Christopher Lee";
        questionsAndAnswers[13][3] = "Bela Lugosi";
        questionsAndAnswers[13][4] = "Humphrey Bogart";

        questionsAndAnswers[14][0] = "The Gododdin by Aneirin is a poet that mentions which Medieval figure?";
        questionsAndAnswers[14][1] = "King Arthur";
        questionsAndAnswers[14][2] = "Merlin";
        questionsAndAnswers[14][3] = "Lancelot";
        questionsAndAnswers[14][4] = "Robin Hood";

        questionsAndAnswers[15][0] = "Which chemical element has the lowest boiling point of all the elements?";
        questionsAndAnswers[15][1] = "Helium";
        questionsAndAnswers[15][2] = "Oxygen";
        questionsAndAnswers[15][3] = "Nitrogen";
        questionsAndAnswers[15][4] = "Hydrogen";

        questionsAndAnswers[16][0] = "What is the common name for ascorbic acid?";
        questionsAndAnswers[16][1] = "Vitamin A";
        questionsAndAnswers[16][2] = "Vitamin B";
        questionsAndAnswers[16][3] = "Vitamin C";
        questionsAndAnswers[16][4] = "Vitamin D";

        questionsAndAnswers[17][0] = "Which forces, named after a Dutch scientist, are distance dependent weak forces between atoms or molecules?";
        questionsAndAnswers[17][1] = "Van der Waals forces";
        questionsAndAnswers[17][2] = "Van Gogh forces";
        questionsAndAnswers[17][3] = "Van Mortson forces";
        questionsAndAnswers[17][4] = "Van Helsing forces";

        questionsAndAnswers[18][0] = "What is Nitrous Oxide more commonly known as?";
        questionsAndAnswers[18][1] = "Laughing Gas";
        questionsAndAnswers[18][2] = "Salt";
        questionsAndAnswers[18][3] = "Water";
        questionsAndAnswers[18][4] = "Shampoo";

        questionsAndAnswers[19][0] = "Name the only metal that is liquid at room temperature?";
        questionsAndAnswers[19][1] = "Mercury";
        questionsAndAnswers[19][2] = "Zinc";
        questionsAndAnswers[19][3] = "Silver";
        questionsAndAnswers[19][4] = "Gold";

        questionsAndAnswers[20][0] = "Which Scottish King banned Golf in 1457?";
        questionsAndAnswers[20][1] = "James II";
        questionsAndAnswers[20][2] = "Henry II";
        questionsAndAnswers[20][3] = "Charles II";
        questionsAndAnswers[20][4] = "Edward VI";

        questionsAndAnswers[21][0] = "What is Tiger Woods real first name?";
        questionsAndAnswers[21][1] = "Eldrick";
        questionsAndAnswers[21][2] = "Tarquin";
        questionsAndAnswers[21][3] = "Isaiah";
        questionsAndAnswers[21][4] = "Ezekiel";

        questionsAndAnswers[22][0] = "Who won the Golf Masters in 1986 for a record 6th time?";
        questionsAndAnswers[22][1] = "Jack Nicklaus";
        questionsAndAnswers[22][2] = "Tiger Woods";
        questionsAndAnswers[22][3] = "Rory Mclroy";
        questionsAndAnswers[22][4] = "Nick Faldo";

        questionsAndAnswers[23][0] = "Which chemist is known for isolating a series of substances for the first time, including potassium and sodium in 1807?";
        questionsAndAnswers[23][1] = "Sir Humphry Davy";
        questionsAndAnswers[23][2] = "Werner Heisenberg";
        questionsAndAnswers[23][3] = "Steven Hawking";
        questionsAndAnswers[23][4] = "Antoine Lavosier";

        questionsAndAnswers[24][0] = "Who did Ben Affleck split up with in 2015?";
        questionsAndAnswers[24][1] = "Jennifer Garner";
        questionsAndAnswers[24][2] = "Jennifer Carpenter";
        questionsAndAnswers[24][3] = "Jennifer Lopez";
        questionsAndAnswers[24][4] = "Jennifer Lawrence";

        questionsAndAnswers[25][0] = "Who discovered the neutron and in what year?";
        questionsAndAnswers[25][1] = "James Chadwick";
        questionsAndAnswers[25][2] = "Werner Heisenberg";
        questionsAndAnswers[25][3] = "Isaac Newton";
        questionsAndAnswers[25][4] = "Albert Einstein";

        questionsAndAnswers[26][0] = "Who did Jennifer Aniston marry in 2015?";
        questionsAndAnswers[26][1] = "Justin Theroux";
        questionsAndAnswers[26][2] = "Justin Timberlake";
        questionsAndAnswers[26][3] = "Matt Damon";
        questionsAndAnswers[26][4] = "Matthew Perry";

        questionsAndAnswers[27][0] = "Who interviewed Prince Charles to commemorate 40 years of the Prince’s Trust?";
        questionsAndAnswers[27][1] = "Ant and Dec";
        questionsAndAnswers[27][2] = "Jeremy Paxman";
        questionsAndAnswers[27][3] = "Michael Parkinson";
        questionsAndAnswers[27][4] = "Jonathan Ross";

        questionsAndAnswers[28][0] = "The red compound hemoglobin, is made of which element?";
        questionsAndAnswers[28][1] = "Iron";
        questionsAndAnswers[28][2] = "Zinc";
        questionsAndAnswers[28][3] = "Mercury";
        questionsAndAnswers[28][4] = "Potassium";

        questionsAndAnswers[29][0] = "How long is Mam Thor, peak district?";
        questionsAndAnswers[29][1] = "517 meters";
        questionsAndAnswers[29][2] = "617 meters";
        questionsAndAnswers[29][3] = "717 meters";
        questionsAndAnswers[29][4] = "817 meters";

//        questionsAndAnswers[30][0] = "What is the highest mountain in the UK?";
//        questionsAndAnswers[30][1] = "Ben Nevis, Scotland";
//        questionsAndAnswers[30][2] = "Kilamangaro";
//        questionsAndAnswers[30][3] = "Snowdon, Wales";
//        questionsAndAnswers[30][4] = "Great Gable, Lake District";
//
//        questionsAndAnswers[31][0] = "Which is the heaviest naturally occurring element?";
//        questionsAndAnswers[31][1] = "Uranium";
//        questionsAndAnswers[31][2] = "Copper";
//        questionsAndAnswers[31][3] = "Tin";
//        questionsAndAnswers[31][4] = "Lead";
//
//        questionsAndAnswers[32][0] = "What was the first Carry On Film?";
//        questionsAndAnswers[32][1] = "Carry on Sergent";
//        questionsAndAnswers[32][2] = "Carry on Cleo";
//        questionsAndAnswers[32][3] = "Carry on Camping";
//        questionsAndAnswers[32][4] = "Carry on Screaming";
//
//        questionsAndAnswers[33][0] = "What was the last Carry On Film?";
//        questionsAndAnswers[33][1] = "Carry On Columbus";
//        questionsAndAnswers[33][2] = "Carry on Cleo";
//        questionsAndAnswers[33][3] = "Carry on Camping";
//        questionsAndAnswers[33][4] = "Carry on Screaming";
//
//        questionsAndAnswers[34][0] = "Who was the first president of the Soviet Union?";
//        questionsAndAnswers[34][1] = "Mikhail Gorbachev";
//        questionsAndAnswers[34][2] = "Boris Yeltsin";
//        questionsAndAnswers[34][3] = "Vladimir Putin";
//        questionsAndAnswers[34][4] = "Nikita Khrushchev";
//
//        questionsAndAnswers[35][0] = "Betsy Trotwood is a fictional character in which novel?";
//        questionsAndAnswers[35][1] = "David Copperfield";
//        questionsAndAnswers[35][2] = "Nicholas Nickleby";
//        questionsAndAnswers[35][3] = "Great Expectations";
//        questionsAndAnswers[35][4] = "Hard Times";
//
//        questionsAndAnswers[36][0] = "The Cheeryble brothers are characters in which book?";
//        questionsAndAnswers[36][1] = "Nicholas Nickleby";
//        questionsAndAnswers[36][2] = "David Copperfield";
//        questionsAndAnswers[36][3] = "Great Expectations";
//        questionsAndAnswers[36][4] = "Hard Times";
//
//        questionsAndAnswers[37][0] = "Where is Mons Huygens the highest mountain?";
//        questionsAndAnswers[37][1] = "The Moon";
//        questionsAndAnswers[37][2] = "Saturn";
//        questionsAndAnswers[37][3] = "Earth";
//        questionsAndAnswers[37][4] = "Jupiter";
//
//        questionsAndAnswers[38][0] = "Which actress born in Hull, East Yorkshire, in 1946 played Countess Esmerelda in Carry On Columbus?";
//        questionsAndAnswers[38][1] = "Maureen Lipman";
//        questionsAndAnswers[38][2] = "Barbara Windsor";
//        questionsAndAnswers[38][3] = "Cilla Black";
//        questionsAndAnswers[38][4] = "Judi Dench";
//
//        questionsAndAnswers[39][0] = "The best-known part of NATO’s founding treaty, Article 5, deals with what topic?";
//        questionsAndAnswers[39][1] = "Collective Defense";
//        questionsAndAnswers[39][2] = "Size of military";
//        questionsAndAnswers[39][3] = "Invitation of new members";
//        questionsAndAnswers[39][4] = "Size of Nuclear Arsenals";
//
//        questionsAndAnswers[40][0] = "In which play are the characters Chiron and Demetrius cut up and baked in a meat pie that their mother is then tricked into eating?";
//        questionsAndAnswers[40][1] = "Titus Andronicus";
//        questionsAndAnswers[40][2] = "A Midsummer Nights Dream";
//        questionsAndAnswers[40][3] = "Romeo and Juliet";
//        questionsAndAnswers[40][4] = "As you Like It";
//
//        questionsAndAnswers[41][0] = "Where is Mount Everest located?";
//        questionsAndAnswers[41][1] = "Nepal";
//        questionsAndAnswers[41][2] = "Scotland";
//        questionsAndAnswers[41][3] = "Germany";
//        questionsAndAnswers[41][4] = "United States";
//
//        questionsAndAnswers[42][0] = "Helena the lower-born ward of a French countess, is in love with Bethram in which play?";
//        questionsAndAnswers[42][1] = "All's well that ends well";
//        questionsAndAnswers[42][2] = "The Twelfth Knight";
//        questionsAndAnswers[42][3] = "The Tempest";
//        questionsAndAnswers[42][4] = "Troilus and Cressida";
//
//        questionsAndAnswers[43][0] = "What war ended after Henry VII beat Richard III in battle?";
//        questionsAndAnswers[43][1] = "The War of the Roses";
//        questionsAndAnswers[43][2] = "Crimean War";
//        questionsAndAnswers[43][3] = "World War 1";
//        questionsAndAnswers[43][4] = "100 years war";
//
//        questionsAndAnswers[44][0] = "What was the nickname of William III?";
//        questionsAndAnswers[44][1] = "William the Orange";
//        questionsAndAnswers[44][2] = "William the Red";
//        questionsAndAnswers[44][3] = "William the Blue";
//        questionsAndAnswers[44][4] = "William the Green";
//
//        questionsAndAnswers[45][0] = "How old was Henry VI when he became king in 1422?";
//        questionsAndAnswers[45][1] = "9 Months old";
//        questionsAndAnswers[45][2] = "9 years old";
//        questionsAndAnswers[45][3] = "19 years old";
//        questionsAndAnswers[45][4] = "9 weeks old";
//
//        questionsAndAnswers[46][0] = "What do we call the first 8 lines of a sonnet?";
//        questionsAndAnswers[46][1] = "Octave";
//        questionsAndAnswers[46][2] = "Octet";
//        questionsAndAnswers[46][3] = "Octane";
//        questionsAndAnswers[46][4] = "Octopus";
//
//        questionsAndAnswers[47][0] = "Which author wrote a famous poem about the Crimean war from 1853 to 1856?";
//        questionsAndAnswers[47][1] = "Alfred Lord Tennyson";
//        questionsAndAnswers[47][2] = "Alfred Douglas";
//        questionsAndAnswers[47][3] = "Oscar Wilde";
//        questionsAndAnswers[47][4] = "William Wordsworth";
//
//        questionsAndAnswers[48][0] = "In which type of poetry does the first letters of each line spell a full word?";
//        questionsAndAnswers[48][1] = "An Acrostic";
//        questionsAndAnswers[48][2] = "An Ode";
//        questionsAndAnswers[48][3] = "A Sonnet";
//        questionsAndAnswers[48][4] = "A Limerick";
//
//        questionsAndAnswers[49][0] = "Which animal is described in the following poem by Robert Burns: “Wee sleekit, cow’rin, tim’rous beastie”?";
//        questionsAndAnswers[49][1] = "A Mouse";
//        questionsAndAnswers[49][2] = "A Cat";
//        questionsAndAnswers[49][3] = "A Dog";
//        questionsAndAnswers[49][4] = "A Rabbit";
//
//        questionsAndAnswers[50][0] = "In a poem by Edward Lear, which instrument is played by the Owl when it serenades the Pussy-cat?";
//        questionsAndAnswers[50][1] = "A Guitar";
//        questionsAndAnswers[50][2] = "A Violin";
//        questionsAndAnswers[50][3] = "A Trumpet";
//        questionsAndAnswers[50][4] = "A Flute";
//
//        questionsAndAnswers[51][0] = "What do we call the rhythm of a poem?";
//        questionsAndAnswers[51][1] = "Meter";
//        questionsAndAnswers[51][2] = "Inch";
//        questionsAndAnswers[51][3] = "Yard";
//        questionsAndAnswers[51][4] = "Mile";
//
//        questionsAndAnswers[52][0] = "How many sonnets did Shakespeare write in his life?";
//        questionsAndAnswers[52][1] = "154";
//        questionsAndAnswers[52][2] = "1";
//        questionsAndAnswers[52][3] = "56";
//        questionsAndAnswers[52][4] = "100";
//
//        questionsAndAnswers[53][0] = "In the poem \"The Rhyme of the Ancient Mariner\", the Mariner shoots which bird?";
//        questionsAndAnswers[53][1] = "An Albatross";
//        questionsAndAnswers[53][2] = "A Raven";
//        questionsAndAnswers[53][3] = "A Eagle";
//        questionsAndAnswers[53][4] = "A Crow";
//
//        questionsAndAnswers[54][0] = "Which of the following Latin American poets won the 1945 Nobel Prize in Literature?";
//        questionsAndAnswers[54][1] = "Gabriela Mistral";
//        questionsAndAnswers[54][2] = "Mario Benedetti";
//        questionsAndAnswers[54][3] = "Jorge Luis Borges";
//        questionsAndAnswers[54][4] = "Andres Bello";
//
//        questionsAndAnswers[55][0] = "Which English king was on the throne at the time of the Battle of Waterloo?";
//        questionsAndAnswers[55][1] = "George III";
//        questionsAndAnswers[55][2] = "Charles II";
//        questionsAndAnswers[55][3] = "James II";
//        questionsAndAnswers[55][4] = "Henry III";
//
//        questionsAndAnswers[56][0] = "The Battle of Agincourt took place in what war?";
//        questionsAndAnswers[56][1] = "100 years war";
//        questionsAndAnswers[56][2] = "War of the Roses";
//        questionsAndAnswers[56][3] = "Falklands War";
//        questionsAndAnswers[56][4] = "7 years War";
//
//        questionsAndAnswers[57][0] = "On a Guitar, what are the steel pieces that you spread your fingers over when you play?";
//        questionsAndAnswers[57][1] = "Frets";
//        questionsAndAnswers[57][2] = "Mahogany";
//        questionsAndAnswers[57][3] = "Bridge";
//        questionsAndAnswers[57][4] = "Sound Holes";
//
//        questionsAndAnswers[58][0] = "Which film received 12 nominations at the February 2016 Academy Awards Ceremony?";
//        questionsAndAnswers[58][1] = "The Revenant";
//        questionsAndAnswers[58][2] = "Get Out";
//        questionsAndAnswers[58][3] = "Mad Max Fury Road";
//        questionsAndAnswers[58][4] = "The Big Short";
//
//        questionsAndAnswers[59][0] = "Who won an Academy Award for Best Supporting Actress in 1987 for her role in Moonstruck?";
//        questionsAndAnswers[59][1] = "Olympia Dukakis";
//        questionsAndAnswers[59][2] = "Kate Winslet";
//        questionsAndAnswers[59][3] = "Maggie Smith";
//        questionsAndAnswers[59][4] = "Vivian Leigh";
//
//        questionsAndAnswers[60][0] = "Which year was the Great Fire of London in?";
//        questionsAndAnswers[60][1] = "1666";
//        questionsAndAnswers[60][2] = "1776";
//        questionsAndAnswers[60][3] = "1886";
//        questionsAndAnswers[60][4] = "1996";
//
//        questionsAndAnswers[61][0] = "In 1969, which two actresses made Oscar history with a tie for the Best Actress award?";
//        questionsAndAnswers[61][1] = "Katherine Hephburn and Barbara Streisand";
//        questionsAndAnswers[61][2] = "Rita Hayworth and Maggie Smith";
//        questionsAndAnswers[61][3] = "Vivian Leigh and Cher";
//        questionsAndAnswers[61][4] = "Diane Keaton and Talia Shire";
//
//        questionsAndAnswers[62][0] = "Which planet is home to the tallest mountain in our Solar System, Olympus Mons?";
//        questionsAndAnswers[62][1] = "Mars";
//        questionsAndAnswers[62][2] = "Jupiter";
//        questionsAndAnswers[62][3] = "Pluto";
//        questionsAndAnswers[62][4] = "Saturn";
//
//        questionsAndAnswers[63][0] = "Which is the only planet that rotates clockwise?";
//        questionsAndAnswers[63][1] = "Venus";
//        questionsAndAnswers[63][2] = "Earth";
//        questionsAndAnswers[63][3] = "Mercury";
//        questionsAndAnswers[63][4] = "Jupiter";
//
//        questionsAndAnswers[64][0] = "Who won the Olympic 2012 800 meters event?";
//        questionsAndAnswers[64][1] = "David Rudisha";
//        questionsAndAnswers[64][2] = "Nigel Amos";
//        questionsAndAnswers[64][3] = "Sebastian Coe";
//        questionsAndAnswers[64][4] = "Wilson Kipketer";
//
//        questionsAndAnswers[65][0] = "Which planet's moons include Oberon, Titania and Miranda?";
//        questionsAndAnswers[65][1] = "Uranus";
//        questionsAndAnswers[65][2] = "Jupiter";
//        questionsAndAnswers[65][3] = "Saturn";
//        questionsAndAnswers[65][4] = "Neptune";
//
//        questionsAndAnswers[66][0] = "What was the official name of the first Cricket World Cup?";
//        questionsAndAnswers[66][1] = "Prudential";
//        questionsAndAnswers[66][2] = "Lancaster";
//        questionsAndAnswers[66][3] = "Groverner";
//        questionsAndAnswers[66][4] = "Legends";
//
//        questionsAndAnswers[67][0] = "What was film star John Wayne’s real name?";
//        questionsAndAnswers[67][1] = "Marion Michael Morrison";
//        questionsAndAnswers[67][2] = "Jonathan Banks";
//        questionsAndAnswers[67][3] = "Edward Sherwood";
//        questionsAndAnswers[67][4] = "Tarquin Stevenson";
//
//        questionsAndAnswers[68][0] = "In first class Indian matches, the maximum distance allowed from pitch to the boundary/ line is?";
//        questionsAndAnswers[68][1] = "75 Yards";
//        questionsAndAnswers[68][2] = "70 Yards";
//        questionsAndAnswers[68][3] = "85 yards";
//        questionsAndAnswers[68][4] = "80 yards";
//
//        questionsAndAnswers[69][0] = "What was the first major Roman City in Britain?";
//        questionsAndAnswers[69][1] = "Colchester";
//        questionsAndAnswers[69][2] = "Londinium";
//        questionsAndAnswers[69][3] = "Eboracum";
//        questionsAndAnswers[69][4] = "Luguvalium";
//
//        questionsAndAnswers[70][0] = "In a game of bingo, which number is represented by the phrase \"two little ducks\"?";
//        questionsAndAnswers[70][1] = "22";
//        questionsAndAnswers[70][2] = "77";
//        questionsAndAnswers[70][3] = "55";
//        questionsAndAnswers[70][4] = "99";
//
//        questionsAndAnswers[71][0] = "The Beaver is a national emblem of which country?";
//        questionsAndAnswers[71][1] = "Canada";
//        questionsAndAnswers[71][2] = "Germany";
//        questionsAndAnswers[71][3] = "Taiwan";
//        questionsAndAnswers[71][4] = "Kenya";
//
//        questionsAndAnswers[72][0] = "How many pints of blood does the average human body contain?";
//        questionsAndAnswers[72][1] = "9";
//        questionsAndAnswers[72][2] = "12";
//        questionsAndAnswers[72][3] = "5";
//        questionsAndAnswers[72][4] = "14";
//
//        questionsAndAnswers[73][0] = "Who was the US president during World War I?";
//        questionsAndAnswers[73][1] = "Woodrow Wilson";
//        questionsAndAnswers[73][2] = "John F Kennedy";
//        questionsAndAnswers[73][3] = "Jimmy Carter";
//        questionsAndAnswers[73][4] = "Gerald Ford";
//
//        questionsAndAnswers[74][0] = "Which African country was formerly known as Abyssinia?";
//        questionsAndAnswers[74][1] = "Ethiopia";
//        questionsAndAnswers[74][2] = "Kenya";
//        questionsAndAnswers[74][3] = "Mauritius";
//        questionsAndAnswers[74][4] = "Chad";
//
//        questionsAndAnswers[75][0] = "Which country was the first to win Eurovision?";
//        questionsAndAnswers[75][1] = "Switzerland";
//        questionsAndAnswers[75][2] = "Sweden";
//        questionsAndAnswers[75][3] = "Norway";
//        questionsAndAnswers[75][4] = "Germany";
//
//        questionsAndAnswers[76][0] = "In Fahrenheit, at what temperature does water freeze?";
//        questionsAndAnswers[76][1] = "32 Degrees";
//        questionsAndAnswers[76][2] = "0 Degrees";
//        questionsAndAnswers[76][3] = "10 Degrees";
//        questionsAndAnswers[76][4] = "-100 Degrees";
//
//        questionsAndAnswers[77][0] = "Kenneth Grahame published what novel?";
//        questionsAndAnswers[77][1] = "The Wind in the Willows";
//        questionsAndAnswers[77][2] = "Alice in Wonderland";
//        questionsAndAnswers[77][3] = "Harry Potter and the Prisoner of Azkaban";
//        questionsAndAnswers[77][4] = "Matilda";
//
//        questionsAndAnswers[78][0] = "In 16th-century Japan, who was Yasuke?";
//        questionsAndAnswers[78][1] = "The First Foreign Samurai";
//        questionsAndAnswers[78][2] = "The Vice President";
//        questionsAndAnswers[78][3] = "A Chemistry professor";
//        questionsAndAnswers[78][4] = "A Renowned Philosopher";
//
//        questionsAndAnswers[79][0] = "In which fictional town was the sitcom Dad’s Army set?";
//        questionsAndAnswers[79][1] = "Walmington on sea";
//        questionsAndAnswers[79][2] = "Privet Drive";
//        questionsAndAnswers[79][3] = "Garfield Close";
//        questionsAndAnswers[79][4] = "Walford";
//
//        questionsAndAnswers[80][0] = "What planet is closest to the sun?";
//        questionsAndAnswers[80][1] = "Mercury";
//        questionsAndAnswers[80][2] = "Venus";
//        questionsAndAnswers[80][3] = "Earth";
//        questionsAndAnswers[80][4] = "Saturn";
//
//        questionsAndAnswers[81][0] = "Which author wrote The Silence of the Lambs?";
//        questionsAndAnswers[81][1] = "James Patterson";
//        questionsAndAnswers[81][2] = "Stephen King";
//        questionsAndAnswers[81][3] = "Charles Dickens";
//        questionsAndAnswers[81][4] = "Anne Rice";
//
//        questionsAndAnswers[82][0] = "Which queen had the shortest reign of Henry VIII’s six wives?";
//        questionsAndAnswers[82][1] = "Anne of Cleaves";
//        questionsAndAnswers[82][2] = "Jane Seymore";
//        questionsAndAnswers[82][3] = "Catherine Howard";
//        questionsAndAnswers[82][4] = "Anne Boleyn";
//
//        questionsAndAnswers[83][0] = "In the novel Robinson Crusoe by Daniel Defoe, Robinson Crusoe set sail from which English seaport in 1651?";
//        questionsAndAnswers[83][1] = "Kingston upon Hull";
//        questionsAndAnswers[83][2] = "Sheffield";
//        questionsAndAnswers[83][3] = "Bristol";
//        questionsAndAnswers[83][4] = "Liverpool";
//
//        questionsAndAnswers[84][0] = "Which philosopher and statesman was knighted by King James I in 1603?";
//        questionsAndAnswers[84][1] = "Sir Francis Bacon";
//        questionsAndAnswers[84][2] = "Sir Walter Raleigh";
//        questionsAndAnswers[84][3] = "Sir David Jason";
//        questionsAndAnswers[84][4] = "Sir John Smith";
//
//        questionsAndAnswers[85][0] = "Which principle asserts that the universe contains all possible forms of existence?";
//        questionsAndAnswers[85][1] = "Principle of Plentitude";
//        questionsAndAnswers[85][2] = "Uncertainty Principle";
//        questionsAndAnswers[85][3] = "Principle of Thought";
//        questionsAndAnswers[85][4] = "The Principle of Contrast";
//
//        questionsAndAnswers[86][0] = "Which branch of philosophy studies the essence of a thing?";
//        questionsAndAnswers[86][1] = "Metaphysics";
//        questionsAndAnswers[86][2] = "Chemistry";
//        questionsAndAnswers[86][3] = "Biology";
//        questionsAndAnswers[86][4] = "Psychoanalysis";
//
//        questionsAndAnswers[87][0] = "Who took the place of Judas in the twelve disciples?";
//        questionsAndAnswers[87][1] = "Matthias";
//        questionsAndAnswers[87][2] = "Paul";
//        questionsAndAnswers[87][3] = "John";
//        questionsAndAnswers[87][4] = "Mark";
//
//        questionsAndAnswers[88][0] = "What wood was Noah's arc built from?";
//        questionsAndAnswers[88][1] = "Gopher";
//        questionsAndAnswers[88][2] = "Balsa";
//        questionsAndAnswers[88][3] = "Pine";
//        questionsAndAnswers[88][4] = "Birch";
//
//        questionsAndAnswers[89][0] = "Which letter never appears in the periodic table?";
//        questionsAndAnswers[89][1] = "J";
//        questionsAndAnswers[89][2] = "Q";
//        questionsAndAnswers[89][3] = "L";
//        questionsAndAnswers[89][4] = "M";
//
//        questionsAndAnswers[90][0] = "The book of Ester is unique because it does not mention which word?";
//        questionsAndAnswers[90][1] = "God";
//        questionsAndAnswers[90][2] = "King";
//        questionsAndAnswers[90][3] = "Queen";
//        questionsAndAnswers[90][4] = "Women";
//
//        questionsAndAnswers[91][0] = "Which of these Elements isn't a noble Gas?";
//        questionsAndAnswers[91][1] = "Chlorine";
//        questionsAndAnswers[91][2] = "Argon";
//        questionsAndAnswers[91][3] = "Krypton";
//        questionsAndAnswers[91][4] = "Helium";
//
//        questionsAndAnswers[92][0] = "How many years did Noah live after the flood?";
//        questionsAndAnswers[92][1] = "350";
//        questionsAndAnswers[92][2] = "20";
//        questionsAndAnswers[92][3] = "1000";
//        questionsAndAnswers[92][4] = "219";
//
//        questionsAndAnswers[93][0] = "In which European city would you find Orly airport?";
//        questionsAndAnswers[93][1] = "Paris";
//        questionsAndAnswers[93][2] = "London";
//        questionsAndAnswers[93][3] = "Milan";
//        questionsAndAnswers[93][4] = "Madrid";
//
//        questionsAndAnswers[94][0] = "Who was the legendary founder of Rome?";
//        questionsAndAnswers[94][1] = "Romulus";
//        questionsAndAnswers[94][2] = "Nero";
//        questionsAndAnswers[94][3] = "Julius Cesar";
//        questionsAndAnswers[94][4] = "Ramses";
//
//        questionsAndAnswers[95][0] = "Kingston, Zuma, and Apollo are the sons of which American female pop star?";
//        questionsAndAnswers[95][1] = "Gwen Stefani";
//        questionsAndAnswers[95][2] = "Taylor Swift";
//        questionsAndAnswers[95][3] = "Katy Perry";
//        questionsAndAnswers[95][4] = "Madonna";
//
//        questionsAndAnswers[96][0] = "Name the English mountaineer who took part in the first three British expeditions to Mount Everest, in the early 1920s?";
//        questionsAndAnswers[96][1] = "George Mallory";
//        questionsAndAnswers[96][2] = "Jonathon Taylor";
//        questionsAndAnswers[96][3] = "Bear Grills";
//        questionsAndAnswers[96][4] = "Steve Irwin";
//
//        questionsAndAnswers[97][0] = "What is the tiny piece at the end of a shoelace called?";
//        questionsAndAnswers[97][1] = "Aglet";
//        questionsAndAnswers[97][2] = "Turner";
//        questionsAndAnswers[97][3] = "Swan";
//        questionsAndAnswers[97][4] = "Lid";
//
//        questionsAndAnswers[98][0] = "Which of Shakespeare’s plays is the longest?";
//        questionsAndAnswers[98][1] = "Hamlet";
//        questionsAndAnswers[98][2] = "Macbeth";
//        questionsAndAnswers[98][3] = "As you like it";
//        questionsAndAnswers[98][4] = "The Tempest";
//
//        questionsAndAnswers[99][0] = "Outside which New York building was John Lennon killed?";
//        questionsAndAnswers[99][1] = "Dakota Building";
//        questionsAndAnswers[99][2] = "Empire State";
//        questionsAndAnswers[99][3] = "Macy's";
//        questionsAndAnswers[99][4] = "The Pentagon";
//
//        questionsAndAnswers[100][0] = "Mr Heathcliff is a character in which Emily Bronte novel?";
//        questionsAndAnswers[100][1] = "Wuthering Heights";
//        questionsAndAnswers[100][2] = "Jane Eyre";
//        questionsAndAnswers[100][3] = "Agnes Grey";
//        questionsAndAnswers[100][4] = "Villette";
//
//        questionsAndAnswers[101][0] = "What was Emily Bronte's only novel?";
//        questionsAndAnswers[101][1] = "Wuthering Heights";
//        questionsAndAnswers[101][2] = "Sanditon";
//        questionsAndAnswers[101][3] = "Jane Eyre";
//        questionsAndAnswers[101][4] = "Villette";
//
//        questionsAndAnswers[102][0] = "What is 230 feet long, 20 inches high and includes 55 dogs, 202 horses and 626 people?";
//        questionsAndAnswers[102][1] = "The Bayeux Tapestry";
//        questionsAndAnswers[102][2] = "Tutankhamuns Tomb";
//        questionsAndAnswers[102][3] = "Noah's Arc";
//        questionsAndAnswers[102][4] = "Moscow State Circus";
//
//        questionsAndAnswers[103][0] = "Question: Which athlete was the first person to take the Olympic oath?";
//        questionsAndAnswers[103][1] = "Victor Boin";
//        questionsAndAnswers[103][2] = "Dave Wottle";
//        questionsAndAnswers[103][3] = "Sebastian Coe";
//        questionsAndAnswers[103][4] = "Steve Redgrave";
//
//        questionsAndAnswers[104][0] = "A cow has how many compartments in its stomach?";
//        questionsAndAnswers[104][1] = "Two";
//        questionsAndAnswers[104][2] = "Three";
//        questionsAndAnswers[104][3] = "Four";
//        questionsAndAnswers[104][4] = "Five";
//
//        questionsAndAnswers[105][0] = "What is the Japanese word for Japan?";
//        questionsAndAnswers[105][1] = "Nihon";
//        questionsAndAnswers[105][2] = "Kukusai";
//        questionsAndAnswers[105][3] = "Japan";
//        questionsAndAnswers[105][4] = "Ainu";
//
//        questionsAndAnswers[106][0] = "What is Japan's largest Island?";
//        questionsAndAnswers[106][1] = "Honshu";
//        questionsAndAnswers[106][2] = "Kyushu";
//        questionsAndAnswers[106][3] = "Okinawa";
//        questionsAndAnswers[106][4] = "Shikoku";
//
//        questionsAndAnswers[107][0] = "What famous woman was a head of the Congress of Ukrainian Nationalists?";
//        questionsAndAnswers[107][1] = "Yaroslava Stecko";
//        questionsAndAnswers[107][2] = "Julia Tymoshenko";
//        questionsAndAnswers[107][3] = "Oksana Bilozir";
//        questionsAndAnswers[107][4] = "Raisa Bogatyro'va";
//
//        questionsAndAnswers[108][0] = "Who was the first prime minister of Australia from 1901-1903?";
//        questionsAndAnswers[108][1] = "Edmund Barton";
//        questionsAndAnswers[108][2] = "Kevin Rudd";
//        questionsAndAnswers[108][3] = "Malcolm Fraser";
//        questionsAndAnswers[108][4] = "Robert Menzies";
//
//        questionsAndAnswers[109][0] = "What was the colour of \"Ukrainian revolution\" of 2004??";
//        questionsAndAnswers[109][1] = "Orange";
//        questionsAndAnswers[109][2] = "Blue";
//        questionsAndAnswers[109][3] = "Red";
//        questionsAndAnswers[109][4] = "Green";
//
//        questionsAndAnswers[110][0] = "Leonid Kuchma was a president of which country?";
//        questionsAndAnswers[110][1] = "Ukraine";
//        questionsAndAnswers[110][2] = "Canada";
//        questionsAndAnswers[110][3] = "India";
//        questionsAndAnswers[110][4] = "Kenya";
//
//        questionsAndAnswers[111][0] = "Which singer fronted the 1970s’ pop group Showaddywaddy?";
//        questionsAndAnswers[111][1] = "Dave Bartram";
//        questionsAndAnswers[111][2] = "Michael Barrat";
//        questionsAndAnswers[111][3] = "Dave Grohl";
//        questionsAndAnswers[111][4] = "Billy Idol";
//
//        questionsAndAnswers[112][0] = "What is the softest mineral?";
//        questionsAndAnswers[112][1] = "Talc";
//        questionsAndAnswers[112][2] = "Fluorite";
//        questionsAndAnswers[112][3] = "Sodalite";
//        questionsAndAnswers[112][4] = "Magnetite";
//
//        questionsAndAnswers[113][0] = "In which country is the Bay of Pigs?";
//        questionsAndAnswers[113][1] = "Cuba";
//        questionsAndAnswers[113][2] = "Mexico";
//        questionsAndAnswers[113][3] = "USA";
//        questionsAndAnswers[113][4] = "Italy";
//
//        questionsAndAnswers[114][0] = "Which medieval queen was married to both Louis VII of France and Henry II of England?";
//        questionsAndAnswers[114][1] = "Eleanor of Aquitaine";
//        questionsAndAnswers[114][2] = "Matilda";
//        questionsAndAnswers[114][3] = "Catherine";
//        questionsAndAnswers[114][4] = "Anne";
//
//        questionsAndAnswers[115][0] = "Which King preceded Queen Victoria?";
//        questionsAndAnswers[115][1] = "William IV";
//        questionsAndAnswers[115][2] = "Henry VIII";
//        questionsAndAnswers[115][3] = "Edward III";
//        questionsAndAnswers[115][4] = "James II";
//
//        questionsAndAnswers[116][0] = "Who famously duelled Alexander Hamilton on 11 July 1804, resulting in the founding father’s death?";
//        questionsAndAnswers[116][1] = "Aaron Burr";
//        questionsAndAnswers[116][2] = "Thomas Jefferson";
//        questionsAndAnswers[116][3] = "Abraham Lincoln";
//        questionsAndAnswers[116][4] = "George Washington";
//        questionsAndAnswers[116][4] = "George Washington";
//
//        questionsAndAnswers[117][0] = "Where was Napoleon Bonaparte born?";
//        questionsAndAnswers[117][1] = "Corsica";
//        questionsAndAnswers[117][2] = "Paris";
//        questionsAndAnswers[117][3] = "Milan";
//        questionsAndAnswers[117][4] = "Stockholm";
//
//        questionsAndAnswers[118][0] = "Which English king died in 1066, leaving no heir to the throne?";
//        questionsAndAnswers[118][1] = "Edward the Confessor";
//        questionsAndAnswers[118][2] = "William I";
//        questionsAndAnswers[118][3] = "Harold";
//        questionsAndAnswers[118][4] = "Charles I";
//
//        questionsAndAnswers[119][0] = "The 1943 autobiography Bound for Glory was written by which American folk singer?";
//        questionsAndAnswers[119][1] = "Woody Gurthrie";
//        questionsAndAnswers[119][2] = "Elizabeth Cotten";
//        questionsAndAnswers[119][3] = "Cisco Houston";
//        questionsAndAnswers[119][4] = "Pete Seeger";
//
//        questionsAndAnswers[120][0] = "The Great Barrier Reef is located in which sea?";
//        questionsAndAnswers[120][1] = "Coral Sea";
//        questionsAndAnswers[120][2] = "Red Sea";
//        questionsAndAnswers[120][3] = "Black Sea";
//        questionsAndAnswers[120][4] = "Caribbean Sea";
//
//        questionsAndAnswers[121][0] = "Which sea represents the south area of the Bay of Biscay?";
//        questionsAndAnswers[121][1] = "Cantabrian";
//        questionsAndAnswers[121][2] = "Kara";
//        questionsAndAnswers[121][3] = "Black sea";
//        questionsAndAnswers[121][4] = "Caribbean Sea";
//
//        questionsAndAnswers[122][0] = "Which Body of Water separates the Italian peninsula from the Balkan Peninsula?";
//        questionsAndAnswers[122][1] = "The Adriatic Sea";
//        questionsAndAnswers[122][2] = "Red Sea";
//        questionsAndAnswers[122][3] = "The Tasman Sea";
//        questionsAndAnswers[122][4] = "Caribbean Sea";
//
//        questionsAndAnswers[123][0] = "Who spent 9 weeks at No1 in the British charts with her debut single ‘Driver’s License’?";
//        questionsAndAnswers[123][1] = "Olivia Rodrigo";
//        questionsAndAnswers[123][2] = "Ariana Grande";
//        questionsAndAnswers[123][3] = "Katy Perry";
//        questionsAndAnswers[123][4] = "Taylor Swift";
//
//        questionsAndAnswers[124][0] = "Who earned his 10th No1 with the song ‘Bad Habits’?";
//        questionsAndAnswers[124][1] = "Ed Sheeran";
//        questionsAndAnswers[124][2] = "Prince";
//        questionsAndAnswers[124][3] = "Billy Idol";
//        questionsAndAnswers[124][4] = "Bruno Mars";
//
//        questionsAndAnswers[125][0] = "Who won the Golf Masters in 2020?";
//        questionsAndAnswers[125][1] = "Dustin Johnson";
//        questionsAndAnswers[125][2] = "Bubba Watson";
//        questionsAndAnswers[125][3] = "Tiger Woods";
//        questionsAndAnswers[125][4] = "Phil Mickleson";
//
//        questionsAndAnswers[126][0] = "In the Netherlands, what is the name of Santa Claus's helper who judges which children were bad during the year?";
//        questionsAndAnswers[126][1] = "Black Peter";
//        questionsAndAnswers[126][2] = "Green Eric";
//        questionsAndAnswers[126][3] = "Mrs Claus";
//        questionsAndAnswers[126][4] = "Eli the Elf";
//
//        questionsAndAnswers[127][0] = "Which British monarch was known by the nickname 'Old Coppernose'?";
//        questionsAndAnswers[127][1] = "Henry VIII";
//        questionsAndAnswers[127][2] = "Charles II";
//        questionsAndAnswers[127][3] = "Richard III";
//        questionsAndAnswers[127][4] = "Henry VII";
//
//        questionsAndAnswers[128][0] = "What was the name of Charles Darwin’s ship?";
//        questionsAndAnswers[128][1] = "HMS Beagle";
//        questionsAndAnswers[128][2] = "HMS Labrador";
//        questionsAndAnswers[128][3] = "HMS Poodle";
//        questionsAndAnswers[128][4] = "HMS Bulldog";
//
//        questionsAndAnswers[129][0] = "What type of monsters were defeated by Ragnar of Denmark and Beowulf?";
//        questionsAndAnswers[129][1] = "Dragons";
//        questionsAndAnswers[129][2] = "Yeti's";
//        questionsAndAnswers[129][3] = "Dinosaurs";
//        questionsAndAnswers[129][4] = "Trolls";
//
//        questionsAndAnswers[130][0] = "Which misshapen creatures in the form of men are said to lurk in the northern forests of Scandinavia?";
//        questionsAndAnswers[130][1] = "Trolls";
//        questionsAndAnswers[130][2] = "Yeti's";
//        questionsAndAnswers[130][3] = "Dinosaurs";
//        questionsAndAnswers[130][4] = "Goblins";
//
//        questionsAndAnswers[131][0] = "A lake demon called Ogapogo is said to ingabit the Canadian lake Okananagan. In which province?";
//        questionsAndAnswers[131][1] = "British Columbia";
//        questionsAndAnswers[131][2] = "Nova Scotia";
//        questionsAndAnswers[131][3] = "Ontario";
//        questionsAndAnswers[131][4] = "Newfoundland and Labrador";
//
//        questionsAndAnswers[132][0] = "Established in 1885 and located in the Rocky Mountains, can you name Canada's oldest national park?";
//        questionsAndAnswers[132][1] = "Banff National Park";
//        questionsAndAnswers[132][2] = "Jasper National Park";
//        questionsAndAnswers[132][3] = "Yoho National Park";
//        questionsAndAnswers[132][4] = "Waterton National Park";
//
//        questionsAndAnswers[133][0] = "In 1988, which city became the first Canadian city to host the Winter Olympic Games?";
//        questionsAndAnswers[133][1] = "Calgary";
//        questionsAndAnswers[133][2] = "Toronto";
//        questionsAndAnswers[133][3] = "Montreal";
//        questionsAndAnswers[133][4] = "Ontario";
//
//        questionsAndAnswers[134][0] = "In tennis, what piece of fruit is found at the top of the men's Wimbledon trophy?";
//        questionsAndAnswers[134][1] = "Pineapple";
//        questionsAndAnswers[134][2] = "Strawberry";
//        questionsAndAnswers[134][3] = "Orange";
//        questionsAndAnswers[134][4] = "Grape";
//
//        questionsAndAnswers[135][0] = "What is the name of the national anthem of Canada?";
//        questionsAndAnswers[135][1] = "O Canada";
//        questionsAndAnswers[135][2] = "I love Canada";
//        questionsAndAnswers[135][3] = "Maple Leaf Anthem";
//        questionsAndAnswers[135][4] = "Canadian Pride";
//
//        questionsAndAnswers[136][0] = "What was the last province to join Canada?";
//        questionsAndAnswers[136][1] = "Newfoundland and Labrador";
//        questionsAndAnswers[136][2] = "Nova Scotia";
//        questionsAndAnswers[136][3] = "Alberto";
//        questionsAndAnswers[136][4] = "Canadian Pride";
//
//        questionsAndAnswers[137][0] = "Who was the mother of Emperor Nero and the wife of Emperor Claudius?";
//        questionsAndAnswers[137][1] = "Agrippina the Younger";
//        questionsAndAnswers[137][2] = "Pompeia Plotina";
//        questionsAndAnswers[137][3] = "Nefertiti";
//        questionsAndAnswers[137][4] = "Pulcheria";
//
//        questionsAndAnswers[138][0] = "What is the name of the man who launched eBay back in 1995?";
//        questionsAndAnswers[138][1] = "Pierre Omidyar";
//        questionsAndAnswers[138][2] = "Jeff Bezos";
//        questionsAndAnswers[138][3] = "Steve Jobs";
//        questionsAndAnswers[138][4] = "James Gosling";
//
//        questionsAndAnswers[139][0] = "Who discovered Penicillin?";
//        questionsAndAnswers[139][1] = "Alexander Fleming";
//        questionsAndAnswers[139][2] = "Albert Einstein";
//        questionsAndAnswers[139][3] = "Isaac Newton";
//        questionsAndAnswers[139][4] = "Marie Curie";
//
//        questionsAndAnswers[140][0] = "An area where rabbits bread go by this male first name?";
//        questionsAndAnswers[140][1] = "Warren";
//        questionsAndAnswers[140][2] = "Dennis";
//        questionsAndAnswers[140][3] = "Adam";
//        questionsAndAnswers[140][4] = "Cory";
//
//        questionsAndAnswers[141][0] = "Who gave Elizabeth I the soubriquet ‘Gloriana?";
//        questionsAndAnswers[141][1] = "Edmund Spenser";
//        questionsAndAnswers[141][2] = "Philip II";
//        questionsAndAnswers[141][3] = "Mary Queen of Scots";
//        questionsAndAnswers[141][4] = "Sir Walter Raleigh";
//
//        questionsAndAnswers[142][0] = "Who led the Scottish army to victory over the English at the battle of Bannockburn in 1314?";
//        questionsAndAnswers[142][1] = "Robert the Bruce";
//        questionsAndAnswers[142][2] = "James II";
//        questionsAndAnswers[142][3] = "William Wallace";
//        questionsAndAnswers[142][4] = "David II";
//
//        questionsAndAnswers[143][0] = "Who is credited as the designer of the many statues which decorated the Parthenon?";
//        questionsAndAnswers[143][1] = "Phidias";
//        questionsAndAnswers[143][2] = "Praxiteles";
//        questionsAndAnswers[143][3] = "Scopas";
//        questionsAndAnswers[143][4] = "Hesiod";
//
//        questionsAndAnswers[144][0] = "The Israeli Army withdrew from its positions in Lebanon in what year?";
//        questionsAndAnswers[144][1] = "2000";
//        questionsAndAnswers[144][2] = "1983";
//        questionsAndAnswers[144][3] = "1975";
//        questionsAndAnswers[144][4] = "2012";
//
//        questionsAndAnswers[145][0] = "The first Israel intifada began in what year?";
//        questionsAndAnswers[145][1] = "1987";
//        questionsAndAnswers[145][2] = "1973";
//        questionsAndAnswers[145][3] = "1967";
//        questionsAndAnswers[145][4] = "1996";
//
//        questionsAndAnswers[146][0] = "Who was the only British Prime Minister to be assassinated?";
//        questionsAndAnswers[146][1] = "Spencer Perceval";
//        questionsAndAnswers[146][2] = "William Pitt the Younger";
//        questionsAndAnswers[146][3] = "Clement Atlee";
//        questionsAndAnswers[146][4] = "David LLoyd George";
//
//        questionsAndAnswers[147][0] = "The United States brought Alaska from what country for 7.2 Million in 1867?";
//        questionsAndAnswers[147][1] = "Russia";
//        questionsAndAnswers[147][2] = "Canada";
//        questionsAndAnswers[147][3] = "Iceland";
//        questionsAndAnswers[147][4] = "Australia";
//
//        questionsAndAnswers[148][0] = "Which president advocated: 'speak softly, and carry a big stick'?";
//        questionsAndAnswers[148][1] = "Theodore Roosevelt";
//        questionsAndAnswers[148][2] = "George Washington";
//        questionsAndAnswers[148][3] = "Franklin D Roosevelt";
//        questionsAndAnswers[148][4] = "Thomas Jefferson";
//
//        questionsAndAnswers[149][0] = "Hailed as the 'Father of the Constitution', name the fourth President of the United States?";
//        questionsAndAnswers[149][1] = "James Madison";
//        questionsAndAnswers[149][2] = "John Quincy Adams";
//        questionsAndAnswers[149][3] = "Franklin D Roosevelt";
//        questionsAndAnswers[149][4] = "Thomas Jefferson";
//
//        questionsAndAnswers[150][0] = "Who was the last Tsar of Russia?";
//        questionsAndAnswers[150][1] = "Nicholas II";
//        questionsAndAnswers[150][2] = "Ivan the Terrible";
//        questionsAndAnswers[150][3] = "Rasputin";
//        questionsAndAnswers[150][4] = "Alexander III";
//
//        questionsAndAnswers[151][0] = "Nessun dorma is an aria from which opera?";
//        questionsAndAnswers[151][1] = "Turandot";
//        questionsAndAnswers[151][2] = "La Boheme";
//        questionsAndAnswers[151][3] = "Tosca";
//        questionsAndAnswers[151][4] = "Eugine Onegin";
//
//        questionsAndAnswers[152][0] = "The Chinese Exclusion Act was signed into law by which US president in 1882?";
//        questionsAndAnswers[152][1] = "Chester A Arthur";
//        questionsAndAnswers[152][2] = "Thomas Jefferson";
//        questionsAndAnswers[152][3] = "Franklin D Roosevelt";
//        questionsAndAnswers[152][4] = "George Washington";
//
//        questionsAndAnswers[153][0] = "How many countries are there in Africa?";
//        questionsAndAnswers[153][1] = "54";
//        questionsAndAnswers[153][2] = "38";
//        questionsAndAnswers[153][3] = "63";
//        questionsAndAnswers[153][4] = "27";
//
//        questionsAndAnswers[154][0] = "Which African country is the only one in the world to lie entirely one thousand metres above sea level?";
//        questionsAndAnswers[154][1] = "Lesotho";
//        questionsAndAnswers[154][2] = "Egypt";
//        questionsAndAnswers[154][3] = "Senegal";
//        questionsAndAnswers[154][4] = "Madagascar";
//
//        questionsAndAnswers[155][0] = "Which Middle Eastern city is also the name of a type of artichoke?";
//        questionsAndAnswers[155][1] = "Jerusalem";
//        questionsAndAnswers[155][2] = "Istanbul";
//        questionsAndAnswers[155][3] = "Cairo";
//        questionsAndAnswers[155][4] = "Dubai";
//
//        questionsAndAnswers[156][0] = "By which sport is Silverstone most associated with?";
//        questionsAndAnswers[156][1] = "Motor Racing";
//        questionsAndAnswers[156][2] = "Golf";
//        questionsAndAnswers[156][3] = "Tennis";
//        questionsAndAnswers[156][4] = "Football";
//
//        questionsAndAnswers[157][0] = "What is the main source of Vitamin C?";
//        questionsAndAnswers[157][1] = "Fruits";
//        questionsAndAnswers[157][2] = "Salt";
//        questionsAndAnswers[157][3] = "Sugar";
//        questionsAndAnswers[157][4] = "Chocolate";
//
//        questionsAndAnswers[158][0] = "The Velocipede was a nineteenth-century prototype of what?";
//        questionsAndAnswers[158][1] = "Bike";
//        questionsAndAnswers[158][2] = "Car";
//        questionsAndAnswers[158][3] = "Tank";
//        questionsAndAnswers[158][4] = "Plane";
//
//        questionsAndAnswers[159][0] = "Who invented the Flying Shuttle in 1733?";
//        questionsAndAnswers[159][1] = "John Kay";
//        questionsAndAnswers[159][2] = "Leonardo Da Vinci";
//        questionsAndAnswers[159][3] = "Frank LLoyd Wright";
//        questionsAndAnswers[159][4] = "Jasper Johns";
//
//        questionsAndAnswers[160][0] = "If you were an LLD, what profession would you be involved in?";
//        questionsAndAnswers[160][1] = "Legal";
//        questionsAndAnswers[160][2] = "Sports";
//        questionsAndAnswers[160][3] = "Medical";
//        questionsAndAnswers[160][4] = "Entertainment";
//
//        questionsAndAnswers[161][0] = "What artist sold a balloon dog for $58.4 million?";
//        questionsAndAnswers[161][1] = "Jeff Koons";
//        questionsAndAnswers[161][2] = "Jackson Pollock";
//        questionsAndAnswers[161][3] = "Andy Warhol";
//        questionsAndAnswers[161][4] = "Damien Hirst";
//
//        questionsAndAnswers[162][0] = "The traditional Claret Jug is the trophy awarded to the winner of which annual sporting event?";
//        questionsAndAnswers[162][1] = "Golf";
//        questionsAndAnswers[162][2] = "Tennis";
//        questionsAndAnswers[162][3] = "Football";
//        questionsAndAnswers[162][4] = "Rugby";
//
//        questionsAndAnswers[163][0] = "Who, in 1991, became the first driver to win the first four races of a Formula One grand prix season?";
//        questionsAndAnswers[163][1] = "Ayrton Senna";
//        questionsAndAnswers[163][2] = "Michael Schumacher";
//        questionsAndAnswers[163][3] = "James Hunt";
//        questionsAndAnswers[163][4] = "Ralph Schumacher";
//
//        questionsAndAnswers[164][0] = "Who was the first black player to play in baseball’s major leagues in 1947?";
//        questionsAndAnswers[164][1] = "Jackie Robinson";
//        questionsAndAnswers[164][2] = "Willie Maze";
//        questionsAndAnswers[164][3] = "Babe Ruth";
//        questionsAndAnswers[164][4] = "Jesse Owens";
//
//        questionsAndAnswers[165][0] = "Which country is considered the primary practitioner of the game Polo?";
//        questionsAndAnswers[165][1] = "Argentina";
//        questionsAndAnswers[165][2] = "Brazil";
//        questionsAndAnswers[165][3] = "Denmark";
//        questionsAndAnswers[165][4] = "Spain";
//
//        questionsAndAnswers[166][0] = "Which British actor won a Golden Globe and an Emmy for his work in the HBO drama series ‘Homeland’?";
//        questionsAndAnswers[166][1] = "Damien Lewis";
//        questionsAndAnswers[166][2] = "Benedict Cumberbatch";
//        questionsAndAnswers[166][3] = "Daniel Craig";
//        questionsAndAnswers[166][4] = "Idris Elba";
//
//        questionsAndAnswers[167][0] = "The line Frailty thy name is woman is from what play?";
//        questionsAndAnswers[167][1] = "Hamlet";
//        questionsAndAnswers[167][2] = "Macbeth";
//        questionsAndAnswers[167][3] = "The Merchant of Venice";
//        questionsAndAnswers[167][4] = "The Tempest";
//
//        questionsAndAnswers[168][0] = "‘God Bless America’ was a 2012 movie made by which comic film-maker and actor?";
//        questionsAndAnswers[168][1] = "Bobcat Goldthwait";
//        questionsAndAnswers[168][2] = "Ben Stiller";
//        questionsAndAnswers[168][3] = "Eddie Murphy";
//        questionsAndAnswers[168][4] = "Tyler Perry";
//
//        questionsAndAnswers[169][0] = "Name the first known European explorer to reach New Zealand and also sight the Fiji islands?";
//        questionsAndAnswers[169][1] = "Abel Tasman";
//        questionsAndAnswers[169][2] = "Marco Polo";
//        questionsAndAnswers[169][3] = "Christopher Columbus";
//        questionsAndAnswers[169][4] = "Francis Drake";
//
//        questionsAndAnswers[170][0] = "Sir Walter Raleigh's 1595 expedition set out to explore the Orinoco River in an attempt to find which fabled city?";
//        questionsAndAnswers[170][1] = "El Dorado";
//        questionsAndAnswers[170][2] = "El Salvador";
//        questionsAndAnswers[170][3] = "Vatican City";
//        questionsAndAnswers[170][4] = "Juneau";
//
//        questionsAndAnswers[171][0] = "What art movement was Yoko Ono associated with during the 1960s?";
//        questionsAndAnswers[171][1] = "Fluxus";
//        questionsAndAnswers[171][2] = "Futurism";
//        questionsAndAnswers[171][3] = "Post Impressionism";
//        questionsAndAnswers[171][4] = "Dadism";
//
//        questionsAndAnswers[172][0] = "1 August 1990 saw 100,000 Iraqi troops invade which neighbouring state, sparking off the first Gulf War?";
//        questionsAndAnswers[172][1] = "Kuweit";
//        questionsAndAnswers[172][2] = "Sudan";
//        questionsAndAnswers[172][3] = "Iran";
//        questionsAndAnswers[172][4] = "USA";
//
//        questionsAndAnswers[173][0] = "In which year did the battle of Waterloo take place?";
//        questionsAndAnswers[173][1] = "1815";
//        questionsAndAnswers[173][2] = "1915";
//        questionsAndAnswers[173][3] = "2015";
//        questionsAndAnswers[173][4] = "1715";
//
//        questionsAndAnswers[174][0] = "Which country became the first to give women the vote in 1893?";
//        questionsAndAnswers[174][1] = "New Zealand";
//        questionsAndAnswers[174][2] = "Australia";
//        questionsAndAnswers[174][3] = "Spain";
//        questionsAndAnswers[174][4] = "Norway";
//
//        questionsAndAnswers[175][0] = "Whose rebel army threw the Spanish out of Venezuela in 1821?";
//        questionsAndAnswers[175][1] = "Simon Bolivar";
//        questionsAndAnswers[175][2] = "Fidel Castro";
//        questionsAndAnswers[175][3] = "Abraham Lincoln";
//        questionsAndAnswers[175][4] = "Napoleon Bonaparte";
//
//        questionsAndAnswers[176][0] = "Who was prime minister when Britain joined the EU?";
//        questionsAndAnswers[176][1] = "Ted Heath";
//        questionsAndAnswers[176][2] = "Tony Blair";
//        questionsAndAnswers[176][3] = "David Cameron";
//        questionsAndAnswers[176][4] = "Harold Wilson";
//
//        questionsAndAnswers[177][0] = "The Mason-Dixon line was originally the boundary between which 2 states?";
//        questionsAndAnswers[177][1] = "Pennsylvania and Maryland";
//        questionsAndAnswers[177][2] = "Mississippi and Alabama";
//        questionsAndAnswers[177][3] = "California and Nevada";
//        questionsAndAnswers[177][4] = "Washington and Idaho";
//
//        questionsAndAnswers[178][0] = "What is the rank just below captain in the NYPD?";
//        questionsAndAnswers[178][1] = "Lieutenant";
//        questionsAndAnswers[178][2] = "Officer";
//        questionsAndAnswers[178][3] = "Sergent";
//        questionsAndAnswers[178][4] = "Chief";
//
//        questionsAndAnswers[179][0] = "Cabrillo beach is a beach in which US State?";
//        questionsAndAnswers[179][1] = "California";
//        questionsAndAnswers[179][2] = "Florida";
//        questionsAndAnswers[179][3] = "Texas";
//        questionsAndAnswers[179][4] = "Michigan";
//
//        questionsAndAnswers[180][0] = "What is the art of stuffing animals for preservation?";
//        questionsAndAnswers[180][1] = "Taxidermy";
//        questionsAndAnswers[180][2] = "Animagus";
//        questionsAndAnswers[180][3] = "Lurching";
//        questionsAndAnswers[180][4] = "Jousting";
//
//        questionsAndAnswers[181][0] = "Shakespeare died during which King's reign?";
//        questionsAndAnswers[181][1] = "James I";
//        questionsAndAnswers[181][2] = "Henry VIII";
//        questionsAndAnswers[181][3] = "Richard I";
//        questionsAndAnswers[181][4] = "Richard II";
//
//        questionsAndAnswers[182][0] = "What holiday takes place each year on February 1st?";
//        questionsAndAnswers[182][1] = "Hoola in the Coola day";
//        questionsAndAnswers[182][2] = "Boxing Day";
//        questionsAndAnswers[182][3] = "Lame Duck Day";
//        questionsAndAnswers[182][4] = "Do Nothing Day";
//
//        questionsAndAnswers[183][0] = "The chemical symbol Y denotes which uncommon metal?";
//        questionsAndAnswers[183][1] = "Yttrium";
//        questionsAndAnswers[183][2] = "Yenonium";
//        questionsAndAnswers[183][3] = "Yej";
//        questionsAndAnswers[183][4] = "Yerium";
//
//        questionsAndAnswers[184][0] = "Which US president had the middle name Milhous?";
//        questionsAndAnswers[184][1] = "Richard Nixon";
//        questionsAndAnswers[184][2] = "Ronald Regan";
//        questionsAndAnswers[184][3] = "James Polk";
//        questionsAndAnswers[184][4] = "Herbert Hoover";
//
//        questionsAndAnswers[185][0] = "What was the first perforated UK postage stamp, issued in 1854?";
//        questionsAndAnswers[185][1] = "Penny Red";
//        questionsAndAnswers[185][2] = "Royal Blue";
//        questionsAndAnswers[185][3] = "Pound Green";
//        questionsAndAnswers[185][4] = "Postage Yellow";
//
//        questionsAndAnswers[186][0] = "Which country's flag is famous for having an AK-47 gun featured on it?";
//        questionsAndAnswers[186][1] = "Mozambique";
//        questionsAndAnswers[186][2] = "USA";
//        questionsAndAnswers[186][3] = "Latvia";
//        questionsAndAnswers[186][4] = "Chile";
//
//        questionsAndAnswers[187][0] = "Which country's national flag is inscribed with the motto 'Ordem e Progresso'?";
//        questionsAndAnswers[187][1] = "Brazil";
//        questionsAndAnswers[187][2] = "Argentina";
//        questionsAndAnswers[187][3] = "Ecuador";
//        questionsAndAnswers[187][4] = "Colombia";
//
//        questionsAndAnswers[188][0] = "How many smaller stars are around the bigger star on the flag of China?";
//        questionsAndAnswers[188][1] = "Four";
//        questionsAndAnswers[188][2] = "Three";
//        questionsAndAnswers[188][3] = "Two";
//        questionsAndAnswers[188][4] = "Five";
//
//        questionsAndAnswers[189][0] = "Which kings lived at Kew Palace at Kew Gardens?";
//        questionsAndAnswers[189][1] = "George II and George III";
//        questionsAndAnswers[189][2] = "Henry VII and Henry VIII";
//        questionsAndAnswers[189][3] = "Richard II and Richard III";
//        questionsAndAnswers[189][4] = "Edward VI and Edward VII";
//
//        questionsAndAnswers[190][0] = "Rose Maylie is the maternal aunt of which Dickens character?";
//        questionsAndAnswers[190][1] = "Oliver Twist";
//        questionsAndAnswers[190][2] = "David Copperfield";
//        questionsAndAnswers[190][3] = "Nicholas Nickleby";
//        questionsAndAnswers[190][4] = "Sissy Jupe";
//
//        questionsAndAnswers[191][0] = "The flag of which country is the oldest national flag still in use?";
//        questionsAndAnswers[191][1] = "Denmark";
//        questionsAndAnswers[191][2] = "Norway";
//        questionsAndAnswers[191][3] = "Finland";
//        questionsAndAnswers[191][4] = "Sweden";
//
//        questionsAndAnswers[192][0] = "The style of music Bolero and Danzon both originate in what country?";
//        questionsAndAnswers[192][1] = "Cuba";
//        questionsAndAnswers[192][2] = "Spain";
//        questionsAndAnswers[192][3] = "Mexico";
//        questionsAndAnswers[192][4] = "Colombia";
//
//        questionsAndAnswers[193][0] = "Ulaanbaatar is the capital of which country?";
//        questionsAndAnswers[193][1] = "Mongolia";
//        questionsAndAnswers[193][2] = "Kenya";
//        questionsAndAnswers[193][3] = "Rwanda";
//        questionsAndAnswers[193][4] = "Mauritius";
//
//        questionsAndAnswers[194][0] = "What is the term for a group of owls?";
//        questionsAndAnswers[194][1] = "Parliament";
//        questionsAndAnswers[194][2] = "Pack";
//        questionsAndAnswers[194][3] = "Den";
//        questionsAndAnswers[194][4] = "Group";
//
//        questionsAndAnswers[195][0] = "Which country was invaded during Operation Barbarossa?";
//        questionsAndAnswers[195][1] = "USSR";
//        questionsAndAnswers[195][2] = "Italy";
//        questionsAndAnswers[195][3] = "Denmark";
//        questionsAndAnswers[195][4] = "France";
//
//        questionsAndAnswers[196][0] = "What is the term for a painting executed entirely in shades of grey?";
//        questionsAndAnswers[196][1] = "Grisaille";
//        questionsAndAnswers[196][2] = "Impasto";
//        questionsAndAnswers[196][3] = "Stereochromy";
//        questionsAndAnswers[196][4] = "Imprimatura";
//
//        questionsAndAnswers[197][0] = "What is the longest book in the Bible?";
//        questionsAndAnswers[197][1] = "Psalms";
//        questionsAndAnswers[197][2] = "Exodus";
//        questionsAndAnswers[197][3] = "Genesis";
//        questionsAndAnswers[197][4] = "Ester";
//
//        questionsAndAnswers[198][0] = "Who was the court sculptor of Alexander the Great?";
//        questionsAndAnswers[198][1] = "Lysippus";
//        questionsAndAnswers[198][2] = "Apelles";
//        questionsAndAnswers[198][3] = "Vitruvius";
//        questionsAndAnswers[198][4] = "Socrates";
//
//        questionsAndAnswers[199][0] = "Which holiday takes place on March 26?";
//        questionsAndAnswers[199][1] = "Make up your own holiday day";
//        questionsAndAnswers[199][2] = "Sleep Day";
//        questionsAndAnswers[199][3] = "Bubble Bath Day";
//        questionsAndAnswers[199][4] = "Hula Day";
//
//        questionsAndAnswers[200][0] = "Vermillion is a shade of which color?";
//        questionsAndAnswers[200][1] = "Red";
//        questionsAndAnswers[200][2] = "Blue";
//        questionsAndAnswers[200][3] = "Green";
//        questionsAndAnswers[200][4] = "Yellow";
//
//        questionsAndAnswers[201][0] = "Matter that does not enter chemical reactions is described as what?";
//        questionsAndAnswers[201][1] = "Inert";
//        questionsAndAnswers[201][2] = "Inhibited";
//        questionsAndAnswers[201][3] = "Grounded";
//        questionsAndAnswers[201][4] = "Sterile";
//
//        questionsAndAnswers[202][0] = "Which type of matter has a definite volume but no definite shape?";
//        questionsAndAnswers[202][1] = "Liquids";
//        questionsAndAnswers[202][2] = "Solids";
//        questionsAndAnswers[202][3] = "Gases";
//        questionsAndAnswers[202][4] = "Plasma";
//
//        questionsAndAnswers[203][0] = "The temperature at which a gas becomes a liquid is its?";
//        questionsAndAnswers[203][1] = "Condensation Point";
//        questionsAndAnswers[203][2] = "Boiling Point";
//        questionsAndAnswers[203][3] = "Melting Point";
//        questionsAndAnswers[203][4] = "Freezing Point";
//
//        questionsAndAnswers[204][0] = "Which chemical element has the atomic number 2?";
//        questionsAndAnswers[204][1] = "Helium";
//        questionsAndAnswers[204][2] = "Hydrogen";
//        questionsAndAnswers[204][3] = "Oxygen";
//        questionsAndAnswers[204][4] = "Nitrogen";
//
//        questionsAndAnswers[205][0] = "Ernest Rutherford, who became known as the father of Nuclear Physics was born in what country?";
//        questionsAndAnswers[205][1] = "New Zealand";
//        questionsAndAnswers[205][2] = "Canada";
//        questionsAndAnswers[205][3] = "Australia";
//        questionsAndAnswers[205][4] = "USA";
//
//        questionsAndAnswers[206][0] = "What English chemist and physicist discovered hydrogen?";
//        questionsAndAnswers[206][1] = "Henry Cavendish";
//        questionsAndAnswers[206][2] = "Bernard Shaw";
//        questionsAndAnswers[206][3] = "Sir William Crookes";
//        questionsAndAnswers[206][4] = "Dorothy Hodgkin";
//
//        questionsAndAnswers[207][0] = "Kiss Me, Kate is a musical written by Bella and Samuel Spewack and is based on which Shakespeare play?";
//        questionsAndAnswers[207][1] = "Taming of the Shrew";
//        questionsAndAnswers[207][2] = "Romeo and Juliet";
//        questionsAndAnswers[207][3] = "Othello";
//        questionsAndAnswers[207][4] = "All's well that ends well";
//
//        questionsAndAnswers[208][0] = "The Royal Albert Dock is found in which UK city?";
//        questionsAndAnswers[208][1] = "Liverpool";
//        questionsAndAnswers[208][2] = "Manchester";
//        questionsAndAnswers[208][3] = "Birmingham";
//        questionsAndAnswers[208][4] = "London";
//
//        questionsAndAnswers[209][0] = "The clownish servant Launce and his dog Crab appear in which Shakespeare play?";
//        questionsAndAnswers[209][1] = "The Two Gentlemen of Verona";
//        questionsAndAnswers[209][2] = "A Midsummer Night's Dream";
//        questionsAndAnswers[209][3] = "All's Well That Ends Well";
//        questionsAndAnswers[209][4] = "As You Like It";
//
//        questionsAndAnswers[210][0] = "Which Spanish leader ruled Spain from 1939 and 1975?";
//        questionsAndAnswers[210][1] = "Francisco Franco";
//        questionsAndAnswers[210][2] = "Fellipe VI";
//        questionsAndAnswers[210][3] = "Juan Carlos I";
//        questionsAndAnswers[210][4] = "Miguel Garcia";
//
//        questionsAndAnswers[211][0] = "David Ben-Gurion was the first prime minister of where?";
//        questionsAndAnswers[211][1] = "Israel";
//        questionsAndAnswers[211][2] = "Libya";
//        questionsAndAnswers[211][3] = "Morocco";
//        questionsAndAnswers[211][4] = "Egypt";
//
//        questionsAndAnswers[212][0] = "Which language is used in Benin?";
//        questionsAndAnswers[212][1] = "French";
//        questionsAndAnswers[212][2] = "English";
//        questionsAndAnswers[212][3] = "Spanish";
//        questionsAndAnswers[212][4] = "German";
//
//        questionsAndAnswers[213][0] = "Mickey Murphy was the baker in which British children’s television programme?";
//        questionsAndAnswers[213][1] = "Pemberwick Green";
//        questionsAndAnswers[213][2] = "Sootie";
//        questionsAndAnswers[213][3] = "Tiswas";
//        questionsAndAnswers[213][4] = "My Parents are Aliens";
//
//        questionsAndAnswers[214][0] = "Which British comedian’s catchphrase was ‘Just like that’?";
//        questionsAndAnswers[214][1] = "Tommy Cooper";
//        questionsAndAnswers[214][2] = "Lee Mack";
//        questionsAndAnswers[214][3] = "Lee Nelson";
//        questionsAndAnswers[214][4] = "Bill Bailey";
//
//        questionsAndAnswers[215][0] = "Which Greek philosopher wrote the book The Republic?";
//        questionsAndAnswers[215][1] = "Plato";
//        questionsAndAnswers[215][2] = "Socrates";
//        questionsAndAnswers[215][3] = "Aristotle";
//        questionsAndAnswers[215][4] = "Homer";
//
//        questionsAndAnswers[216][0] = "Amman and Petra are cities in which country?";
//        questionsAndAnswers[216][1] = "Jordan";
//        questionsAndAnswers[216][2] = "Israel";
//        questionsAndAnswers[216][3] = "Syria";
//        questionsAndAnswers[216][4] = "Lebanon";
//
//        questionsAndAnswers[217][0] = "By what name was Shakespeare’s mother known before her marriage?";
//        questionsAndAnswers[217][1] = "Mary Arden";
//        questionsAndAnswers[217][2] = "Sarah Jane";
//        questionsAndAnswers[217][3] = "Florence Anna";
//        questionsAndAnswers[217][4] = "Harriet Alice";
//
//        questionsAndAnswers[218][0] = "Who created the framework for the Virginia Plan, that structured the US Government into three branches?";
//        questionsAndAnswers[218][1] = "James Madison";
//        questionsAndAnswers[218][2] = "George Bush";
//        questionsAndAnswers[218][3] = "Thomas Jefferson";
//        questionsAndAnswers[218][4] = "John Quincy Adams";
//
//        questionsAndAnswers[219][0] = "Which Shakespeare play is there no song?";
//        questionsAndAnswers[219][1] = "The Comedy Of Errors";
//        questionsAndAnswers[219][2] = "Hamlet";
//        questionsAndAnswers[219][3] = "Taming of the Shrew";
//        questionsAndAnswers[219][4] = "King Lear";
//
//        questionsAndAnswers[220][0] = "What phrase means \"a death blow intended to end the suffering of a wounded creature\"?";
//        questionsAndAnswers[220][1] = "Coup de grace";
//        questionsAndAnswers[220][2] = "Rigor Mortis";
//        questionsAndAnswers[220][3] = "Sotto Voce";
//        questionsAndAnswers[220][4] = "Estocada";
//
//        questionsAndAnswers[221][0] = "Writes of passage is a novel written by?";
//        questionsAndAnswers[221][1] = "William Golding";
//        questionsAndAnswers[221][2] = "John Steinbeck";
//        questionsAndAnswers[221][3] = "J.K Rowling";
//        questionsAndAnswers[221][4] = "Daniel Defoe";
//
//        questionsAndAnswers[222][0] = "Samuel Langhorne Clements is better known as?";
//        questionsAndAnswers[222][1] = "Mark Twain";
//        questionsAndAnswers[222][2] = "Daniel Defoe";
//        questionsAndAnswers[222][3] = "Jonathan Swift";
//        questionsAndAnswers[222][4] = "Robert Louis Stevenson";
//
//        questionsAndAnswers[223][0] = "In which book of Agatha Christi did the demise of Poirot take place?";
//        questionsAndAnswers[223][1] = "Curtain";
//        questionsAndAnswers[223][2] = "The Regatta Myster";
//        questionsAndAnswers[223][3] = "Death in the Clouds";
//        questionsAndAnswers[223][4] = "Cards on the Table";
//
//        questionsAndAnswers[224][0] = "What year boasted the first woman in space?";
//        questionsAndAnswers[224][1] = "1963";
//        questionsAndAnswers[224][2] = "1968";
//        questionsAndAnswers[224][3] = "1983";
//        questionsAndAnswers[224][4] = "1973";
//
//        questionsAndAnswers[225][0] = "Who wrote the childrens book Bedknobs and Broomsticks?";
//        questionsAndAnswers[225][1] = "Mary Norton";
//        questionsAndAnswers[225][2] = "Enid Blyton";
//        questionsAndAnswers[225][3] = "J.K Rowling";
//        questionsAndAnswers[225][4] = "Suzanne Collins";
//
//        questionsAndAnswers[226][0] = "What is the third sign of the zodiac?";
//        questionsAndAnswers[226][1] = "Gemini";
//        questionsAndAnswers[226][2] = "Capricorn";
//        questionsAndAnswers[226][3] = "Taurus";
//        questionsAndAnswers[226][4] = "Leo";
//
//        questionsAndAnswers[227][0] = "Who plays Bree Van De Kamp in the US TV series \"Desperate Housewives\"?";
//        questionsAndAnswers[227][1] = "Marcia Cross";
//        questionsAndAnswers[227][2] = "Anna Paquin";
//        questionsAndAnswers[227][3] = "Felicity Huffman";
//        questionsAndAnswers[227][4] = "Helen Worth";
//
//        questionsAndAnswers[228][0] = "Which writer was responsible for making the sonnet a popular English verse form?";
//        questionsAndAnswers[228][1] = "Sir Philip Sidney";
//        questionsAndAnswers[228][2] = "William Daniel";
//        questionsAndAnswers[228][3] = "Michael Drayton";
//        questionsAndAnswers[228][4] = "John Donne";
//
//        questionsAndAnswers[229][0] = "Mark Twain, Robert Louis Stevenson and T.S Eliot were all born in what century?";
//        questionsAndAnswers[229][1] = "19th";
//        questionsAndAnswers[229][2] = "20th";
//        questionsAndAnswers[229][3] = "16th";
//        questionsAndAnswers[229][4] = "18th";
//
//        questionsAndAnswers[230][0] = "In which sport are the terms blitz and bomb used?";
//        questionsAndAnswers[230][1] = "American Football";
//        questionsAndAnswers[230][2] = "Tennis";
//        questionsAndAnswers[230][3] = "Baseball";
//        questionsAndAnswers[230][4] = "Golf";
//
//        questionsAndAnswers[231][0] = "Who painted the American Gothic in 1930?";
//        questionsAndAnswers[231][1] = "Grant Wood";
//        questionsAndAnswers[231][2] = "Andy Warhol";
//        questionsAndAnswers[231][3] = "Jackson Pollock";
//        questionsAndAnswers[231][4] = "Pablo Picasso";
//
//        questionsAndAnswers[232][0] = "In which state of the USA is the private research university known as M. I. T.?";
//        questionsAndAnswers[232][1] = "Massachusetts";
//        questionsAndAnswers[232][2] = "Michigan";
//        questionsAndAnswers[232][3] = "Missouri";
//        questionsAndAnswers[232][4] = "Maryland";
//
//
//        questionsAndAnswers[233][0] = "Which of the following is a halogen?";
//        questionsAndAnswers[233][1] = "Astatine";
//        questionsAndAnswers[233][2] = "Cesium";
//        questionsAndAnswers[233][3] = "Ruthenium";
//        questionsAndAnswers[233][4] = "Radon";
//
//        questionsAndAnswers[234][0] = "Which biblical heroine is mentioned in John Keates poem Ode to a Nightingale?";
//        questionsAndAnswers[234][1] = "Ruth";
//        questionsAndAnswers[234][2] = "Mary";
//        questionsAndAnswers[234][3] = "Ester";
//        questionsAndAnswers[234][4] = "Miraiam";
//
//        questionsAndAnswers[235][0] = "The song Papa Don't Preach is from which Madonna album?";
//        questionsAndAnswers[235][1] = "True Blue";
//        questionsAndAnswers[235][2] = "Like A Virgin";
//        questionsAndAnswers[235][3] = "Like A Prayer";
//        questionsAndAnswers[235][4] = "Ray Of Light";
//
//        questionsAndAnswers[236][0] = "Which of the 'Carry On' films tagline was, 'Up your anchor for a well crewed voyage'?";
//        questionsAndAnswers[236][1] = "Carry On Columbus";
//        questionsAndAnswers[236][2] = "Carry On Cruising";
//        questionsAndAnswers[236][3] = "Carry on Abroad";
//        questionsAndAnswers[236][4] = "Carry On England";
//
//        questionsAndAnswers[237][0] = "How many of the 'Carry On' films did Sid James star in?";
//        questionsAndAnswers[237][1] = "19";
//        questionsAndAnswers[237][2] = "18";
//        questionsAndAnswers[237][3] = "17";
//        questionsAndAnswers[237][4] = "20";
//
//        questionsAndAnswers[238][0] = "In which 'Carry On' do we meet the character Lord Darcy Pue, played by Jim Dale?";
//        questionsAndAnswers[238][1] = "Carry On - don't lose your head";
//        questionsAndAnswers[238][2] = "Carry On Henry";
//        questionsAndAnswers[238][3] = "Carry on Sergeant";
//        questionsAndAnswers[238][4] = "Carry On Citizen";
//
//
//        questionsAndAnswers[239][0] = "Where was NATO founded?";
//        questionsAndAnswers[239][1] = "Washington";
//        questionsAndAnswers[239][2] = "London";
//        questionsAndAnswers[239][3] = "Rome";
//        questionsAndAnswers[239][4] = "Oslo";
//
//        questionsAndAnswers[240][0] = "Which of the following countries is a founding member of NATO?";
//        questionsAndAnswers[240][1] = "Luxembourg";
//        questionsAndAnswers[240][2] = "Greece";
//        questionsAndAnswers[240][3] = "Spain";
//        questionsAndAnswers[240][4] = "Turkey";
//
//        questionsAndAnswers[241][0] = "Which country rules over the Caracas island archipelago?";
//        questionsAndAnswers[241][1] = "Venezuela";
//        questionsAndAnswers[241][2] = "Cuba";
//        questionsAndAnswers[241][3] = "Mexico";
//        questionsAndAnswers[241][4] = "Brazil";
//
//        questionsAndAnswers[242][0] = "What colour is the copper mineral called \"malachite\"?";
//        questionsAndAnswers[242][1] = "Green";
//        questionsAndAnswers[242][2] = "Blue";
//        questionsAndAnswers[242][3] = "Red";
//        questionsAndAnswers[242][4] = "Brown";
//
//        questionsAndAnswers[243][0] = "Who defeated the British army in 1879 at the Battle of Isandlwana?";
//        questionsAndAnswers[243][1] = "Zulus";
//        questionsAndAnswers[243][2] = "Turks";
//        questionsAndAnswers[243][3] = "Boes";
//        questionsAndAnswers[243][4] = "Russians";
//
//        questionsAndAnswers[244][0] = "Which of these is a weapon developed in South America?";
//        questionsAndAnswers[244][1] = "Tapas";
//        questionsAndAnswers[244][2] = "Bolas";
//        questionsAndAnswers[244][3] = "Gobos";
//        questionsAndAnswers[244][4] = "Polos";
//
//        questionsAndAnswers[245][0] = "Which war was the napalm incendiary bomb first used?";
//        questionsAndAnswers[245][1] = "World War 2";
//        questionsAndAnswers[245][2] = "Korean War";
//        questionsAndAnswers[245][3] = "World War 1";
//        questionsAndAnswers[245][4] = "Vietnam War";
//
//        questionsAndAnswers[246][0] = "Which vitamin helps in chemical transmission from eye to brain?";
//        questionsAndAnswers[246][1] = "Vitamin A";
//        questionsAndAnswers[246][2] = "Vitamin B";
//        questionsAndAnswers[246][3] = "Vitamin D";
//        questionsAndAnswers[246][4] = "Vitamin E";
//
//        questionsAndAnswers[247][0] = "What is the 18th century Frenchman Antoine Louis known for?";
//        questionsAndAnswers[247][1] = "Inventing the guillotine?";
//        questionsAndAnswers[247][2] = "Opening the first French restaraunt";
//        questionsAndAnswers[247][3] = "Being second in command to Napoleon";
//        questionsAndAnswers[247][4] = "Playing football";
//
//        questionsAndAnswers[248][0] = "Which of these Vice Presidents was the Governor of New York?";
//        questionsAndAnswers[248][1] = "Theodore Roosevelt";
//        questionsAndAnswers[248][2] = "George H.W Bush";
//        questionsAndAnswers[248][3] = "Mike Pence";
//        questionsAndAnswers[248][4] = "Joe Biden";
//
//        questionsAndAnswers[249][0] = "Which of these is an earlier name for the game of darts?";
//        questionsAndAnswers[249][1] = "Butts";
//        questionsAndAnswers[249][2] = "Trogs";
//        questionsAndAnswers[249][3] = "Flags";
//        questionsAndAnswers[249][4] = "Pins";
//
//        questionsAndAnswers[250][0] = "Yale University is in which state of the USA?";
//        questionsAndAnswers[250][1] = "Connecticut";
//        questionsAndAnswers[250][2] = "Massachusetts";
//        questionsAndAnswers[250][3] = "Vermont";
//        questionsAndAnswers[250][4] = "Maine";
//
//        questionsAndAnswers[251][0] = "What is Canadas tallest Mountain?";
//        questionsAndAnswers[251][1] = "Logan";
//        questionsAndAnswers[251][2] = "Robson";
//        questionsAndAnswers[251][3] = "Forbes";
//        questionsAndAnswers[251][4] = "North Twin";
//
//        questionsAndAnswers[252][0] = "Who married Sir Winston Churchill?";
//        questionsAndAnswers[252][1] = "Clementine Hozier";
//        questionsAndAnswers[252][2] = "Geraldine Primrose";
//        questionsAndAnswers[252][3] = "Barbara Rosebery";
//        questionsAndAnswers[252][4] = "Jacqueline St Helier";
//
//        questionsAndAnswers[253][0] = "100 kopeks make up one what?";
//        questionsAndAnswers[253][1] = "Rouble";
//        questionsAndAnswers[253][2] = "Drachma";
//        questionsAndAnswers[253][3] = "Baht";
//        questionsAndAnswers[253][4] = "Real";
//
//        questionsAndAnswers[254][0] = "What was the first satellite put into orbit by the USA?";
//        questionsAndAnswers[254][1] = "Explorer";
//        questionsAndAnswers[254][2] = "Mercury";
//        questionsAndAnswers[254][3] = "Genesis";
//        questionsAndAnswers[254][4] = "Voyager";
//
//        questionsAndAnswers[255][0] = "Which of these is a type of butterfly?";
//        questionsAndAnswers[255][1] = "Cabbage White";
//        questionsAndAnswers[255][2] = "Lettuce Green";
//        questionsAndAnswers[255][3] = "Turnip Brown";
//        questionsAndAnswers[255][4] = "Broccoli Blue";
//
//        questionsAndAnswers[256][0] = "In which country is the city of Kandahar?";
//        questionsAndAnswers[256][1] = "Afghanistan";
//        questionsAndAnswers[256][2] = "India";
//        questionsAndAnswers[256][3] = "Russia";
//        questionsAndAnswers[256][4] = "Syria";
//
//        questionsAndAnswers[257][0] = "Which car maker has a trident as its symbol?";
//        questionsAndAnswers[257][1] = "Maserati";
//        questionsAndAnswers[257][2] = "Ford";
//        questionsAndAnswers[257][3] = "BMW";
//        questionsAndAnswers[257][4] = "Porsche";
//
//        questionsAndAnswers[258][0] = "John Milton created what name for the capital of Hell in his poem \"Paradise Lost\"?";
//        questionsAndAnswers[258][1] = "Pandemonium";
//        questionsAndAnswers[258][2] = "Dystopia";
//        questionsAndAnswers[258][3] = "Chaos";
//        questionsAndAnswers[258][4] = "Bedlam";
//
//        questionsAndAnswers[259][0] = "In golf, what is the term for \"three strokes under par\"?";
//        questionsAndAnswers[259][1] = "Albatross";
//        questionsAndAnswers[259][2] = "Bogey";
//        questionsAndAnswers[259][3] = "Eagle";
//        questionsAndAnswers[259][4] = "Crow";
//
//        questionsAndAnswers[260][0] = "Which English explorer commanded the ships \"Discovery\" and \"Terra Nova\" to explore the Antarctic?";
//        questionsAndAnswers[260][1] = "Robert Falcon Scott";
//        questionsAndAnswers[260][2] = "Francis Drake";
//        questionsAndAnswers[260][3] = "Sir Walter Raleigh";
//        questionsAndAnswers[260][4] = "Sir John Hawkins";
//
//
//        questionsAndAnswers[261][0] = "What is the capital of Kenya?";
//        questionsAndAnswers[261][1] = "Nairobi";
//        questionsAndAnswers[261][2] = "Stockholm";
//        questionsAndAnswers[261][3] = "Lagos";
//        questionsAndAnswers[261][4] = "Cairo";
//
//        questionsAndAnswers[262][0] = "Dill is commonly used in what?";
//        questionsAndAnswers[262][1] = "Borshch";
//        questionsAndAnswers[262][2] = "Coffee";
//        questionsAndAnswers[262][3] = "Madras Curry";
//        questionsAndAnswers[262][4] = "Meringue";
//
//        questionsAndAnswers[263][0] = "What river runs through Rome?";
//        questionsAndAnswers[263][1] = "Tiber";
//        questionsAndAnswers[263][2] = "Rhine";
//        questionsAndAnswers[263][3] = "Seine";
//        questionsAndAnswers[263][4] = "Nile";
//
//        questionsAndAnswers[264][0] = "Which of these characters appear in the Charles Dickens novel \"Martin Chuzzlewit\"?";
//        questionsAndAnswers[264][1] = "Charity and Mercy Pecksniff";
//        questionsAndAnswers[264][2] = "The Cheeryble Brothers";
//        questionsAndAnswers[264][3] = "Mr and Mrs Sowerberry";
//        questionsAndAnswers[264][4] = "Miss Havisham and Estella";
//
//        questionsAndAnswers[265][0] = "Michael Cera's character in Arrested Development shares a name with which pop legend?";
//        questionsAndAnswers[265][1] = "George Michael";
//        questionsAndAnswers[265][2] = "Elton John";
//        questionsAndAnswers[265][3] = "Justin Timberlake";
//        questionsAndAnswers[265][4] = "Bruno Mars";
//
//        questionsAndAnswers[266][0] = "What was the Bayside High gang's hangout spot on Saved By the Bell?";
//        questionsAndAnswers[266][1] = "The Max";
//        questionsAndAnswers[266][2] = "The Top";
//        questionsAndAnswers[266][3] = "The Pen";
//        questionsAndAnswers[266][4] = "The Yard"
//
//        questionsAndAnswers[267][0] = "Which Shakespeare play starts with the line ‘Now is the winter of our discontent’?";
//        questionsAndAnswers[267][1] = "Richard III";
//        questionsAndAnswers[267][2] = "Macbeth";
//        questionsAndAnswers[267][3] = "As You Like It";
//        questionsAndAnswers[267][4] = "Romeo and Juliet"
//
//        questionsAndAnswers[268][0] = "Baffin Island is located in which country?";
//        questionsAndAnswers[268][1] = "Canada";
//        questionsAndAnswers[268][2] = "Mexico";
//        questionsAndAnswers[268][3] = "Cuba";
//        questionsAndAnswers[268][4] = "Bulgaria"
//
//        questionsAndAnswers[269][0] = "According to the Bible which son of Enoch lived for 969 years?";
//        questionsAndAnswers[269][1] = "Methuselah";
//        questionsAndAnswers[269][2] = "John";
//        questionsAndAnswers[269][3] = "Ishmael";
//        questionsAndAnswers[269][4] = "Jesus"
//
//        questionsAndAnswers[270][0] = "What day is St Patrick's day?";
//        questionsAndAnswers[270][1] = "March 17th";
//        questionsAndAnswers[270][2] = "March 16th";
//        questionsAndAnswers[270][3] = "March 15th";
//        questionsAndAnswers[270][4] = "March 14th"
//
//        questionsAndAnswers[271][0] = "Which of the following animals sleeps standing up?";
//        questionsAndAnswers[271][1] = "Flamingos";
//        questionsAndAnswers[271][2] = "Gorrilas";
//        questionsAndAnswers[271][3] = "Hedgehogs";
//        questionsAndAnswers[271][4] = "Ravens"
//
//        questionsAndAnswers[272][0] = "What is the name of the dog in the Punch and Judy show?";
//        questionsAndAnswers[272][1] = "Toby";
//        questionsAndAnswers[272][2] = "Fido";
//        questionsAndAnswers[272][3] = "Rover";
//        questionsAndAnswers[272][4] = "Josh"
//
//        questionsAndAnswers[273][0] = "The amount of matter in an object is called its what?";
//        questionsAndAnswers[273][1] = "Mass";
//        questionsAndAnswers[273][2] = "Density";
//        questionsAndAnswers[273][3] = "Weight";
//        questionsAndAnswers[273][4] = "Cubit"
//
//        questionsAndAnswers[274][0] = "Which African country is the city Timbuktu in?";
//        questionsAndAnswers[274][1] = "Mali";
//        questionsAndAnswers[274][2] = "Kenya";
//        questionsAndAnswers[274][3] = "Algeria";
//        questionsAndAnswers[274][4] = "Lesotho"
//
//        questionsAndAnswers[275][0] = "Which Muslim name means purity?";
//        questionsAndAnswers[275][1] = "Maryam";
//        questionsAndAnswers[275][2] = "Zainab";
//        questionsAndAnswers[275][3] = "Fatima";
//        questionsAndAnswers[275][4] = "Mahek"
//
//        questionsAndAnswers[276][0] = "What is the longest river in France?";
//        questionsAndAnswers[276][1] = "Loire";
//        questionsAndAnswers[276][2] = "Seine";
//        questionsAndAnswers[276][3] = "Rhone";
//        questionsAndAnswers[276][4] = "Gironde"
//
//        questionsAndAnswers[277][0] = "Under which Roman emperor was the Colosseum completed?";
//        questionsAndAnswers[277][1] = "Vespasian";
//        questionsAndAnswers[277][2] = "Nero";
//        questionsAndAnswers[277][3] = "Trajan";
//        questionsAndAnswers[277][4] = "Constantine I"
//
//        questionsAndAnswers[278][0] = "In which US city is the Sears Tower?";
//        questionsAndAnswers[278][1] = "Chicago";
//        questionsAndAnswers[278][2] = "Boston";
//        questionsAndAnswers[278][3] = "St Louis";
//        questionsAndAnswers[278][4] = "San Francisco"
//
//        questionsAndAnswers[279][0] = "Diego Garcia is in which Ocean?";
//        questionsAndAnswers[279][1] = "Indian Ocean";
//        questionsAndAnswers[279][2] = "Pacific Ocean";
//        questionsAndAnswers[279][3] = "Atlantic Ocean";
//        questionsAndAnswers[279][4] = "Arctic Ocean"
//
//        questionsAndAnswers[280][0] = "What is the name of the Jewish bible?";
//        questionsAndAnswers[280][1] = "Tanakh"
//        questionsAndAnswers[280][2] = "Bible";
//        questionsAndAnswers[280][3] = "Chakra";
//        questionsAndAnswers[280][4] = "Torah"
//
//        questionsAndAnswers[281][0] = "Tina Turner sang the James Bond theme tune for which movie?";
//        questionsAndAnswers[281][1] = "Goldeneye"
//        questionsAndAnswers[281][2] = "Tomorrow Never Dies";
//        questionsAndAnswers[281][3] = "Goldfinger";
//        questionsAndAnswers[281][4] = "Live and Let Die"
//
//        questionsAndAnswers[282][0] = "What is the name of the dog owned by Bill Sykes in Oliver Twist?";
//        questionsAndAnswers[282][1] = "Bullseye"
//        questionsAndAnswers[282][2] = "Ripper";
//        questionsAndAnswers[282][3] = "Gnasher";
//        questionsAndAnswers[282][4] = "Rover"
//
//        questionsAndAnswers[283][0] = "What was Rita Skeeter's profession in the Harry Potter books?";
//        questionsAndAnswers[283][1] = "Reporter"
//        questionsAndAnswers[283][2] = "Auror";
//        questionsAndAnswers[283][3] = "Quidditch Player";
//        questionsAndAnswers[283][4] = "Bus Driver"
//
//        questionsAndAnswers[284][0] = "What is the name for the style of furniture made in England between 1603 and 1688?";
//        questionsAndAnswers[284][1] = "Jacobean"
//        questionsAndAnswers[284][2] = "Victorian";
//        questionsAndAnswers[284][3] = "Pre-Norman";
//        questionsAndAnswers[284][4] = "Ikea"
//
//        questionsAndAnswers[285][0] = "A \"parsec\" is a measure of what?";
//        questionsAndAnswers[285][1] = "Distance"
//        questionsAndAnswers[285][2] = "Speed";
//        questionsAndAnswers[285][3] = "Luminance";
//        questionsAndAnswers[285][4] = "Acceleration"
//
//        questionsAndAnswers[286][0] = "The sport of 'shikar' involved what?";
//        questionsAndAnswers[286][1] = "Organised game hunting "
//        questionsAndAnswers[286][2] = "Bull-baiting";
//        questionsAndAnswers[286][3] = "Falconry";
//        questionsAndAnswers[286][4] = "A goat's head and a long stick "
//
//        questionsAndAnswers[287][0] = "The Road to Wigan Pier is a book by who?";
//        questionsAndAnswers[287][1] = "George Orwell "
//        questionsAndAnswers[287][2] = "Alexander Dumas";
//        questionsAndAnswers[287][3] = "Robert Louis Stevenson";
//        questionsAndAnswers[287][4] = "J.D Salinger"
//
//        questionsAndAnswers[288][0] = "Which US presidential candidate won the popular vote in 1876?";
//        questionsAndAnswers[288][1] = "Samuel J Tilden";
//        questionsAndAnswers[288][2] = "William A Wheeler";
//        questionsAndAnswers[288][3] = "James A Garfield";
//        questionsAndAnswers[288][4] = "Rutherford B Hayes";
//
//        questionsAndAnswers[289][0] = "Which archbishop of Canterbury was burned at the stake for heresy during the Tudor period?";
//        questionsAndAnswers[289][1] = "Thomas Cranmer";
//        questionsAndAnswers[289][2] = "Thomas Beckett";
//        questionsAndAnswers[289][3] = "Thomas Cromwell";
//        questionsAndAnswers[289][4] = "Stephen Langton";
//
//        questionsAndAnswers[290][0] = "Which easily-trained monkey has been popularly associated with roving performers such as organ grinders?";
//        questionsAndAnswers[290][1] = "Capuchin";
//        questionsAndAnswers[290][2] = "Grivet";
//        questionsAndAnswers[290][3] = "Debasian Monkey";
//        questionsAndAnswers[290][4] = "Squirrel Monkey";
//
//        questionsAndAnswers[291][0] = "After he left the White House, President Theodore Roosevelt stood for election in 1912 as the candidate of what party?";
//        questionsAndAnswers[291][1] = "Bull Moose Party";
//        questionsAndAnswers[291][2] = "Republican Party";
//        questionsAndAnswers[291][3] = "Democratic Party";
//        questionsAndAnswers[291][4] = "Peace Party";
//
//
//        questionsAndAnswers[292][0] = "In which year was the first Winter Olympics held?";
//        questionsAndAnswers[292][1] = "1924";
//        questionsAndAnswers[292][2] = "1948";
//        questionsAndAnswers[292][3] = "1964";
//        questionsAndAnswers[292][4] = "1900";
//
//        questionsAndAnswers[293][0] = "Which person was the founding member of the IOC?";
//        questionsAndAnswers[293][1] = "Pierre Baron De Coubertin";
//        questionsAndAnswers[293][2] = "Avery Brundage";
//        questionsAndAnswers[293][3] = "Thomas Bach";
//        questionsAndAnswers[293][4] = "Henri comet de Baillet-Latour";
//
//        questionsAndAnswers[294][0] = "For which activity is sir Anthony Caro famous?";
//        questionsAndAnswers[294][1] = "Sculpture";
//        questionsAndAnswers[294][2] = "Photography";
//        questionsAndAnswers[294][3] = "Ballet";
//        questionsAndAnswers[294][4] = "Fashion design";
//
//
//        questionsAndAnswers[295][0] = "Which English statesman and adviser to Henry VIII was the son of a butcher?";
//        questionsAndAnswers[295][1] = "Thomas Wolsey";
//        questionsAndAnswers[295][2] = "Thomas More";
//        questionsAndAnswers[295][3] = "Thomas Cromwell";
//        questionsAndAnswers[295][4] = "Richard Nanfan";
//
//
//        questionsAndAnswers[296][0] = "At which Olympics did the Munich Massacre occur?";
//        questionsAndAnswers[296][1] = "1972";
//        questionsAndAnswers[296][2] = "1976";
//        questionsAndAnswers[296][3] = "1948";
//        questionsAndAnswers[296][4] = "1936";
//
//        questionsAndAnswers[297][0] = "Which county in England was Jane Austen born in?";
//        questionsAndAnswers[297][1] = "Hampshire";
//        questionsAndAnswers[297][2] = "Somerset";
//        questionsAndAnswers[297][3] = "Kent";
//        questionsAndAnswers[297][4] = "Essex";
//
//        questionsAndAnswers[298][0] = "Jane Austen dedicated Emma to which royal family member?";
//        questionsAndAnswers[298][1] = "The Prince Regent";
//        questionsAndAnswers[298][2] = "Prince Edward";
//        questionsAndAnswers[298][3] = "Queen Caroline";
//        questionsAndAnswers[298][4] = "Princess Charlotte";
//
//        questionsAndAnswers[299][0] = "In which Shakespeare play does the character Falstaff appear?";
//        questionsAndAnswers[299][1] = "Henry IV";
//        questionsAndAnswers[299][2] = "Richard III";
//        questionsAndAnswers[299][3] = "Antony and Cleopatra";
//        questionsAndAnswers[299][4] = "As You Like It";
//
//        questionsAndAnswers[300][0] = "What was the given title of Jane Austen's final and incomplete novel?";
//        questionsAndAnswers[300][1] = "Sanditon";
//        questionsAndAnswers[300][2] = "The Watsons";
//        questionsAndAnswers[300][3] = "Persuasion";
//        questionsAndAnswers[300][4] = "Lady Susan";
//
//        questionsAndAnswers[301][0] = "In what country did Peaches originate?";
//        questionsAndAnswers[301][1] = "China";
//        questionsAndAnswers[301][2] = "Russia";
//        questionsAndAnswers[301][3] = "India";
//        questionsAndAnswers[301][4] = "Germany";
//
//
//        questionsAndAnswers[302][0] = "Lolla Rossa is?";
//        questionsAndAnswers[302][1] = "A type of lettuce";
//        questionsAndAnswers[302][2] = "A winery in Italy";
//        questionsAndAnswers[302][3] = "A way to prepare fish";
//        questionsAndAnswers[302][4] = "A large furry animal";
//
//        questionsAndAnswers[303][0] = "Which type of aircraft was used to bomb Hiroshima, Japan, in World War II?";
//        questionsAndAnswers[303][1] = "B-29 Superfortress";
//        questionsAndAnswers[303][2] = "B-52 Stratofortress";
//        questionsAndAnswers[303][3] = "B-24 Liberator";
//        questionsAndAnswers[303][4] = "B-17 Flying Fortress";
//
//        questionsAndAnswers[304][0] = "Who restored democratic rule to the Philippines after the long dictatorship of Ferdinand Marcos?";
//        questionsAndAnswers[304][1] = "Corazon Aquino";
//        questionsAndAnswers[304][2] = "Manuel Roxas";
//        questionsAndAnswers[304][3] = "Benigno Aquino Jr";
//        questionsAndAnswers[304][4] = "Fidel Ramos";
//
//        questionsAndAnswers[305][0] = "What reaction involving atomic nuclei is the source of the Sun’s energy?";
//        questionsAndAnswers[305][1] = "Nuclear Fusion";
//        questionsAndAnswers[305][2] = "Nuclear Fission";
//        questionsAndAnswers[305][3] = "Chemical Combustion";
//        questionsAndAnswers[305][4] = "Ionization";
//
//        questionsAndAnswers[306][0] = "Which of these is heavier than iron?";
//        questionsAndAnswers[306][1] = "Gold";
//        questionsAndAnswers[306][2] = "Silver";
//        questionsAndAnswers[306][3] = "Potassium";
//        questionsAndAnswers[306][4] = "Carbon";
//
//        questionsAndAnswers[307][0] = "How many electrons does a sodium atom have?";
//        questionsAndAnswers[307][1] = "11";
//        questionsAndAnswers[307][2] = "9";
//        questionsAndAnswers[307][3] = "13";
//        questionsAndAnswers[307][4] = "15";
//
//        questionsAndAnswers[308][0] = "Which element is almost as light as Hydrogen?";
//        questionsAndAnswers[308][1] = "Helium";
//        questionsAndAnswers[308][2] = "Krypton";
//        questionsAndAnswers[308][3] = "Aluminium";
//        questionsAndAnswers[308][4] = "Oxygen";
//
//        questionsAndAnswers[309][0] = "In what year was King John forced to sign the first Magna Carta?";
//        questionsAndAnswers[309][1] = "1215";
//        questionsAndAnswers[309][2] = "1290";
//        questionsAndAnswers[309][3] = "1350";
//        questionsAndAnswers[309][4] = "1245";
//
//        questionsAndAnswers[310][0] = "What is a Tarsier?";
//        questionsAndAnswers[310][1] = "A Primate";
//        questionsAndAnswers[310][2] = "A Bird";
//        questionsAndAnswers[310][3] = "A Fish";
//        questionsAndAnswers[310][4] = "A Lizard";
//
//        questionsAndAnswers[311][0] = "What of these Animals does not belong in the Chinese Zodiac?";
//        questionsAndAnswers[311][1] = "A Bear";
//        questionsAndAnswers[311][2] = "A Dog";
//        questionsAndAnswers[311][3] = "A Dragon";
//        questionsAndAnswers[311][4] = "A Rabbit";
//
//        questionsAndAnswers[312][0] = "What metal makes up 92.5% of an Olympic Gold medal?";
//        questionsAndAnswers[312][1] = "Silver";
//        questionsAndAnswers[312][2] = "Bronze";
//        questionsAndAnswers[312][3] = "Copper";
//        questionsAndAnswers[312][4] = "Gold";
//
//        questionsAndAnswers[313][0] = "If somewhere or something is noisome it?";
//        questionsAndAnswers[313][1] = "Smells very unpleasant";
//        questionsAndAnswers[313][2] = "Is full of noise";
//        questionsAndAnswers[313][3] = "Is sickening";
//        questionsAndAnswers[313][4] = "Can be smelled";
//
//        questionsAndAnswers[314][0] = "Who was the last monarch of the house of Hanover?";
//        questionsAndAnswers[314][1] = "Victoria";
//        questionsAndAnswers[314][2] = "George III";
//        questionsAndAnswers[314][3] = "George IV";
//        questionsAndAnswers[314][4] = "William IV";
//
//        questionsAndAnswers[315][0] = "Where is the Temple of Confucius?";
//        questionsAndAnswers[315][1] = "Qufu";
//        questionsAndAnswers[315][2] = "Angkor Wat";
//        questionsAndAnswers[315][3] = "Machu Picchu";
//        questionsAndAnswers[315][4] = "Giza";
//
//        questionsAndAnswers[316][0] = "Which of the following items was owned by the fewest U.S. homes in 1990?";
//        questionsAndAnswers[316][1] = "Compact Disc Player";
//        questionsAndAnswers[316][2] = "Home Computer";
//        questionsAndAnswers[316][3] = "Cordless Phone";
//        questionsAndAnswers[316][4] = "Dishwasher";
//
//        questionsAndAnswers[317][0] = "Who drafted the US decleration of independence?";
//        questionsAndAnswers[317][1] = "Thomas Jefferson";
//        questionsAndAnswers[317][2] = "Abraham Lincoln";
//        questionsAndAnswers[317][3] = "King George III";
//        questionsAndAnswers[317][4] = "George Washington";
//
//        questionsAndAnswers[318][0] = "Who wrote the American national anthem?";
//        questionsAndAnswers[318][1] = "Francis Scott Key";
//        questionsAndAnswers[318][2] = "Francis Bellamy";
//        questionsAndAnswers[318][3] = "Francis Drake";
//        questionsAndAnswers[318][4] = "F. Scott Fitzgerald";
//
//        questionsAndAnswers[319][0] = "What is the nickname for the old regulations requiring racial segregation?";
//        questionsAndAnswers[319][1] = "Jim Crow laws";
//        questionsAndAnswers[319][2] = "Blue laws";
//        questionsAndAnswers[319][3] = "Stone the crow laws";
//        questionsAndAnswers[319][4] = "Old crow laws";
//
//        questionsAndAnswers[319][0] = "Who was the Greek goddess of the rainbow?";
//        questionsAndAnswers[319][1] = "Iris";
//        questionsAndAnswers[319][2] = "Hecate";
//        questionsAndAnswers[319][3] = "Hera";
//        questionsAndAnswers[319][4] = "Aphrodite";
//
//        questionsAndAnswers[320][0] = "What is the first \"self-evident truth\" in the Declaration of Independence?";
//        questionsAndAnswers[320][1] = "That all men are created equal";
//        questionsAndAnswers[320][2] = "That standing armies should not exist";
//        questionsAndAnswers[320][3] = "That everyone should have a right to vote";
//        questionsAndAnswers[320][4] = "That honesty is the best policy";
//
//        questionsAndAnswers[321][0] = "What is the name of the Greek goddess of the Earth";
//        questionsAndAnswers[321][1] = "Gaea";
//        questionsAndAnswers[321][2] = "Hera";
//        questionsAndAnswers[321][3] = "Aphrodite";
//        questionsAndAnswers[321][4] = "Demeter";
//
//        questionsAndAnswers[322][0] = "The death of which Greek legend is celebrated as a Spartan festival?";
//        questionsAndAnswers[322][1] = "Hyacinthus";
//        questionsAndAnswers[322][2] = "Astraeus";
//        questionsAndAnswers[322][3] = "Selene";
//        questionsAndAnswers[322][4] = "Coeus";
//
//        questionsAndAnswers[323][0] = "What is Themis the god of?";
//        questionsAndAnswers[323][1] = "Wisdom and Good Council";
//        questionsAndAnswers[323][2] = "War and Violence";
//        questionsAndAnswers[323][3] = "Love and Beauty";
//        questionsAndAnswers[323][4] = "Prophecy and Poetry";
//
//        questionsAndAnswers[324][0] = "What is the world’s second deepest lake?";
//        questionsAndAnswers[324][1] = "Tanganyika";
//        questionsAndAnswers[324][2] = "Erie";
//        questionsAndAnswers[324][3] = "Baikal";
//        questionsAndAnswers[324][4] = "Zuric";
//
//        questionsAndAnswers[325][0] = "Who became Poet Laureate for the UK in 2019?";
//        questionsAndAnswers[325][1] = "Simon Armitage";
//        questionsAndAnswers[325][2] = "Ian Neale";
//        questionsAndAnswers[325][3] = "John Arnold";
//        questionsAndAnswers[325][4] = "Michael May";
//
//        questionsAndAnswers[326][0] = "In Greek Mythology, how many heads did the monster Typhon have?";
//        questionsAndAnswers[326][1] = "100";
//        questionsAndAnswers[326][2] = "50";
//        questionsAndAnswers[326][3] = "75";
//        questionsAndAnswers[326][4] = "219";
//
//        questionsAndAnswers[327][0] = "In some parts of the world, mysterious deaths of which creature threaten agriculture?";
//        questionsAndAnswers[327][1] = "Bees";
//        questionsAndAnswers[327][2] = "Vipers";
//        questionsAndAnswers[327][3] = "Fire Ants";
//        questionsAndAnswers[327][4] = "Kangaroos";
//
//        questionsAndAnswers[328][0] = "Which of the following is not a Marsupial?";
//        questionsAndAnswers[328][1] = "Badger";
//        questionsAndAnswers[328][2] = "Kangaroo";
//        questionsAndAnswers[328][3] = "Wombat";
//        questionsAndAnswers[328][4] = "Koala";
//
//        questionsAndAnswers[329][0] = "Which dictator immortalized the words Veni vidi vici?";
//        questionsAndAnswers[329][1] = "Julius Cesar";
//        questionsAndAnswers[329][2] = "Kublai Khan";
//        questionsAndAnswers[329][3] = "Napoleon I";
//        questionsAndAnswers[329][4] = "Alexander The Great";
//
//        questionsAndAnswers[330][0] = "Who was the first President of the national football league?";
//        questionsAndAnswers[330][1] = "Jim Thorpe";
//        questionsAndAnswers[330][2] = "Jim Brown";
//        questionsAndAnswers[330][3] = "Johnny Unitas";
//        questionsAndAnswers[330][4] = "Knute Rockne";
//
//
//        questionsAndAnswers[331][0] = "Which of these is not a kind of fish tail?";
//        questionsAndAnswers[331][1] = "Hypercritical";
//        questionsAndAnswers[331][2] = "Hetrocercal";
//        questionsAndAnswers[331][3] = "Homocercal";
//        questionsAndAnswers[331][4] = "Diphycercal";
//
//        questionsAndAnswers[332][0] = "Which of these animals swims in an upright position?";
//        questionsAndAnswers[332][1] = "Sea Horse";
//        questionsAndAnswers[332][2] = "Sea Lion";
//        questionsAndAnswers[332][3] = "Sea Slug";
//        questionsAndAnswers[332][4] = "Sea Urchin";
//
//        questionsAndAnswers[333][0] = "What was Memorial Day originally called?";
//        questionsAndAnswers[333][1] = "Decoration Day";
//        questionsAndAnswers[333][2] = "War Remembarance Day";
//        questionsAndAnswers[333][3] = "Civil War Day";
//        questionsAndAnswers[333][4] = "Flag Day";
//
//        questionsAndAnswers[334][0] = "What was the first continuously published newspaper in the American colonies?";
//        questionsAndAnswers[334][1] = "Boston News Letter";
//        questionsAndAnswers[334][2] = "American Weekly Mercury";
//        questionsAndAnswers[334][3] = "Virginia Gazette";
//        questionsAndAnswers[334][4] = "New York Weekly Journal";
//
//        questionsAndAnswers[335][0] = "Which Greek goddess refused to marry anyone, unless they could beat her in a foot race?";
//        questionsAndAnswers[335][1] = "Atlanta";
//        questionsAndAnswers[335][2] = "Penelope";
//        questionsAndAnswers[335][3] = "Athena";
//        questionsAndAnswers[335][4] = "Nausicaa";
//
//        questionsAndAnswers[336][0] = "The theremin belongs to this class of musical instruments?";
//        questionsAndAnswers[336][1] = "Electronic";
//        questionsAndAnswers[336][2] = "Wind";
//        questionsAndAnswers[336][3] = "Percussion";
//        questionsAndAnswers[336][4] = "Keyboard";
//
//        questionsAndAnswers[337][0] = "Which of these is not a type of African drum?";
//        questionsAndAnswers[337][1] = "Timpani";
//        questionsAndAnswers[337][2] = "Djembe";
//        questionsAndAnswers[337][3] = "Gudugudu";
//        questionsAndAnswers[337][4] = "Talking Drum";
//
//        questionsAndAnswers[338][0] = "How man pedals does a grand piano have?";
//        questionsAndAnswers[338][1] = "3";
//        questionsAndAnswers[338][2] = "2";
//        questionsAndAnswers[338][3] = "1";
//        questionsAndAnswers[338][4] = "4";
//
//        questionsAndAnswers[339][0] = "The saxophone is a popular jazz instrument, but what was its first use?";
//        questionsAndAnswers[339][1] = "Military Music";
//        questionsAndAnswers[339][2] = "Bluegrass Music";
//        questionsAndAnswers[339][3] = "Drowning out Fluets";
//        questionsAndAnswers[339][4] = "War Music";
//
//        questionsAndAnswers[340][0] = "Who sings rain on me with Lady Gaga?";
//        questionsAndAnswers[340][1] = "Ariana Grande";
//        questionsAndAnswers[340][2] = "Miley Cyrus";
//        questionsAndAnswers[340][3] = "Nicki Minaj";
//        questionsAndAnswers[340][4] = "Taylor Swift";
//
//        questionsAndAnswers[341][0] = "Who is the youngest member of Little Mix?";
//        questionsAndAnswers[341][1] = "Perrie";
//        questionsAndAnswers[341][2] = "Jesy";
//        questionsAndAnswers[341][3] = "Jade";
//        questionsAndAnswers[341][4] = "Leigh";
//
//        questionsAndAnswers[342][0] = "What is the name of the end of a horn that projects the sound?";
//        questionsAndAnswers[342][1] = "Bell";
//        questionsAndAnswers[342][2] = "Gong";
//        questionsAndAnswers[342][3] = "Barrel";
//        questionsAndAnswers[342][4] = "Euphonium";
//
//        questionsAndAnswers[343][0] = "Which of these instruments requires a reed to be played?";
//        questionsAndAnswers[343][1] = "Clarinet";
//        questionsAndAnswers[343][2] = "Flute";
//        questionsAndAnswers[343][3] = "Lute";
//        questionsAndAnswers[343][4] = "Viola";
//
//        questionsAndAnswers[344][0] = "Who was the first woman in New Zealand to hold the office of prime minister immediately following an election?";
//        questionsAndAnswers[344][1] = "Helen Clark";
//        questionsAndAnswers[344][2] = "Margaret Thatcher";
//        questionsAndAnswers[344][3] = "Mary Robinson";
//        questionsAndAnswers[344][4] = "Eugena Charles";
//
//        questionsAndAnswers[345][0] = "Who was Ireland's first female president?";
//        questionsAndAnswers[345][1] = "Mary Robinson";
//        questionsAndAnswers[345][2] = "Jennifer Shipley";
//        questionsAndAnswers[345][3] = "Mary Francis Clark";
//        questionsAndAnswers[345][4] = "Margaret Thatcher";
//
//        questionsAndAnswers[346][0] = "Who was first UK Prime Minister to be elected after World War 2?";
//        questionsAndAnswers[346][1] = "Clement Atlee";
//        questionsAndAnswers[346][2] = "Harold Wilson";
//        questionsAndAnswers[346][3] = "Neville Chamberlain";
//        questionsAndAnswers[346][4] = "Alec Douglas-Home";
//
//        questionsAndAnswers[347][0] = "Which constituency was David Cameron the MP for?";
//        questionsAndAnswers[347][1] = "Witney";
//        questionsAndAnswers[347][2] = "Uxbridge and South Ruislip";
//        questionsAndAnswers[347][3] = "Huntington";
//        questionsAndAnswers[347][4] = "Sedgefield";
//
//        questionsAndAnswers[348][0] = "Who was the titular Queen of England for nine days?";
//        questionsAndAnswers[348][1] = "Lady Jane Grey";
//        questionsAndAnswers[348][2] = "Anne Boleyn";
//        questionsAndAnswers[348][3] = "Catherine of Aragon";
//        questionsAndAnswers[348][4] = "Elizabeth I";
//
//        questionsAndAnswers[349][0] = "What was the top selling song of 2019?";
//        questionsAndAnswers[349][1] = "Someone you loved";
//        questionsAndAnswers[349][2] = "Old town road";
//        questionsAndAnswers[349][3] = "I don't care";
//        questionsAndAnswers[349][4] = "American girl";
//
//        questionsAndAnswers[350][0] = "Which female rappers real name is Belcalis Marlenis Almánzar?";
//        questionsAndAnswers[350][1] = "Cardi B";
//        questionsAndAnswers[350][2] = "Nicki Minaj";
//        questionsAndAnswers[350][3] = "Queen Latifah";
//        questionsAndAnswers[350][4] = "Lil Kim";
//
//        questionsAndAnswers[351][0] = "What was the name of Ed Sheeran's first studio album?";
//        questionsAndAnswers[351][1] = "Plus";
//        questionsAndAnswers[351][2] = "Divide";
//        questionsAndAnswers[351][3] = "Multiply";
//        questionsAndAnswers[351][4] = "Subtract";
//
//        questionsAndAnswers[352][0] = "Who was the Prime Minister when England won the World Cup?";
//        questionsAndAnswers[352][1] = "Harlod Wilson";
//        questionsAndAnswers[352][2] = "Winston Churchill";
//        questionsAndAnswers[352][3] = "Clement Atlee";
//        questionsAndAnswers[352][4] = "Harold MacMillian";
//
//        questionsAndAnswers[353][0] = "In what country did the Battle of Waterloo take place?";
//        questionsAndAnswers[353][1] = "Belgium";
//        questionsAndAnswers[353][2] = "France";
//        questionsAndAnswers[353][3] = "Germany";
//        questionsAndAnswers[353][4] = "Netherlands";
//
//        questionsAndAnswers[354][0] = "Which treaty ended the War of 1812?";
//        questionsAndAnswers[354][1] = "Treaty of Ghent";
//        questionsAndAnswers[354][2] = "Treaty of Versailles";
//        questionsAndAnswers[354][3] = "Maastricth Treaty";
//        questionsAndAnswers[354][4] = "Treaty of Brest-Litovsk";
//
//        questionsAndAnswers[355][0] = "What is the easternmost county in the U.K?";
//        questionsAndAnswers[355][1] = "Suffolk";
//        questionsAndAnswers[355][2] = "Shropshire";
//        questionsAndAnswers[355][3] = "Surrey";
//        questionsAndAnswers[355][4] = "Staffordshire";
//
//        questionsAndAnswers[356][0] = "Which Hollywood Star published the autobiography The Moon's a Balloon in 1971?";
//        questionsAndAnswers[356][1] = "David Niven";
//        questionsAndAnswers[356][2] = "Stewart Granger";
//        questionsAndAnswers[356][3] = "Gregory Peck";
//        questionsAndAnswers[356][4] = "Burt Lancaster";
//
//        questionsAndAnswers[357][0] = "Who is known as the father of classical conditioning?";
//        questionsAndAnswers[357][1] = "Ivan Pavlov";
//        questionsAndAnswers[357][2] = "Sigmund Freud";
//        questionsAndAnswers[357][3] = "BF Skinner";
//        questionsAndAnswers[357][4] = "Jean Paul Satre";
//
//        questionsAndAnswers[358][0] = "What type of behaviour modification relies on consequences?";
//        questionsAndAnswers[358][1] = "Operant conditioning";
//        questionsAndAnswers[358][2] = "Classical conditioning";
//        questionsAndAnswers[358][3] = "Flooding";
//        questionsAndAnswers[358][4] = "Aversion therapy";
//
//        questionsAndAnswers[359][0] = "Who was the first woman to earn a Ph.D. in psychology?";
//        questionsAndAnswers[359][1] = "Margaret Floy Washburn";
//        questionsAndAnswers[359][2] = "Leta Stetter Hollingworth";
//        questionsAndAnswers[359][3] = "Mary Whiton Calkins";
//        questionsAndAnswers[359][4] = "Helen Thompson Wooley";
//
//        questionsAndAnswers[360][0] = "What Burns' work provided the title for a Ken Loach directed film?";
//        questionsAndAnswers[360][1] = "Ae Fond Kiss";
//        questionsAndAnswers[360][2] = "Birks of Aberfeldy";
//        questionsAndAnswers[360][3] = "Halloween";
//        questionsAndAnswers[360][4] = "Tam O Shatner";
//
//        questionsAndAnswers[361][0] = "Which of these cheeses comes originally from Italy?";
//        questionsAndAnswers[361][1] = "Gorgonzola";
//        questionsAndAnswers[361][2] = "Cheddar";
//        questionsAndAnswers[361][3] = "Gouda";
//        questionsAndAnswers[361][4] = "Emmenthaler";
//
//        questionsAndAnswers[362][0] = "What did artificial mean?";
//        questionsAndAnswers[362][1] = "Skillful";
//        questionsAndAnswers[362][2] = "Inhuman";
//        questionsAndAnswers[362][3] = "An Art Critic";
//        questionsAndAnswers[362][4] = "Morbid";
//
//        questionsAndAnswers[363][0] = "Of the Presidents of Egypt since it was declared a republic in 1953 who has served the longest?";
//        questionsAndAnswers[363][1] = "Hosni Mubarak";
//        questionsAndAnswers[363][2] = "Anwar Sadat";
//        questionsAndAnswers[363][3] = "Muhammad Naguib";
//        questionsAndAnswers[363][4] = "Gamal Abdel Nasser";
//
//        questionsAndAnswers[364][0] = "What was a broach?";
//        questionsAndAnswers[364][1] = "A cooking spit";
//        questionsAndAnswers[364][2] = "A delivery of beef";
//        questionsAndAnswers[364][3] = "A place past a point of encounter";
//        questionsAndAnswers[364][4] = "An ornament fastened to clothing by a pin";
//
//        questionsAndAnswers[365][0] = "Where were the 1948 Winter Olympics held?";
//        questionsAndAnswers[365][1] = "San Moritz Switzerland";
//        questionsAndAnswers[365][2] = "London UK";
//        questionsAndAnswers[365][3] = "Helsinki Finland";
//        questionsAndAnswers[365][4] = "Stockholm Sweden";
//
//        questionsAndAnswers[366][0] = "How many times has London hosted the Summer Olympics?";
//        questionsAndAnswers[366][1] = "2";
//        questionsAndAnswers[366][2] = "1";
//        questionsAndAnswers[366][3] = "3";
//        questionsAndAnswers[366][4] = "4";
//
//        questionsAndAnswers[367][0] = "Which Tsar was assassinated in 1981?";
//        questionsAndAnswers[367][1] = "Alexander II";
//        questionsAndAnswers[367][2] = "Alexander I";
//        questionsAndAnswers[367][3] = "Nicholas I";
//        questionsAndAnswers[367][4] = "Alexander III";
//
//        questionsAndAnswers[368][0] = "In which country was ex-England cricket captain Tony Greig born?";
//        questionsAndAnswers[368][1] = "South Africa";
//        questionsAndAnswers[368][2] = "Australia";
//        questionsAndAnswers[368][3] = "Germany";
//        questionsAndAnswers[368][4] = "Canada";
//
//        questionsAndAnswers[369][0] = "Jerk, clean & snatch are terms used in what activity?";
//        questionsAndAnswers[369][1] = "Weight Lifting";
//        questionsAndAnswers[369][2] = "Boxing";
//        questionsAndAnswers[369][3] = "Ballet Dancing";
//        questionsAndAnswers[369][4] = "Gymnastics";
//
//        questionsAndAnswers[370][0] = "According to an infamous Chicago Tribune headline, who defeated President Harry Truman in the 1948 election?";
//        questionsAndAnswers[370][1] = "Thomas Dewey";
//        questionsAndAnswers[370][2] = "Wendell Willkie";
//        questionsAndAnswers[370][3] = "Storm Thurmond";
//        questionsAndAnswers[370][4] = "Harold Stassen";
//
//        questionsAndAnswers[371][0] = "In 1984 President Ronald Reagan won every state except one. Which one did he lose?";
//        questionsAndAnswers[371][1] = "Minnesota";
//        questionsAndAnswers[371][2] = "New York";
//        questionsAndAnswers[371][3] = "Vermont";
//        questionsAndAnswers[371][4] = "Michigan";
//
//        questionsAndAnswers[372][0] = "Which presidential candidate holds the record for the most second-place finishes?";
//        questionsAndAnswers[372][1] = "William Jennings Bryan";
//        questionsAndAnswers[372][2] = "Henry Clay";
//        questionsAndAnswers[372][3] = "Adlai Stevenson";
//        questionsAndAnswers[372][4] = "Aaron Burr";
//
//        questionsAndAnswers[373][0] = "One of the biggest trade centres at the end of the Middle Ages was?";
//        questionsAndAnswers[373][1] = "Venice";
//        questionsAndAnswers[373][2] = "Milan";
//        questionsAndAnswers[373][3] = "Rome";
//        questionsAndAnswers[373][4] = "Florence";
//
//        questionsAndAnswers[374][0] = "Boswash is a?";
//        questionsAndAnswers[374][1] = "Megalopolis";
//        questionsAndAnswers[374][2] = "Metropolis";
//        questionsAndAnswers[374][3] = "Megacity";
//        questionsAndAnswers[374][4] = "Megascraper";
//
//        questionsAndAnswers[375][0] = "What kind of music and dance is associated with the Andalusian Roma of Spain?";
//        questionsAndAnswers[375][1] = "Flamenco";
//        questionsAndAnswers[375][2] = "Tango";
//        questionsAndAnswers[375][3] = "Samba";
//        questionsAndAnswers[375][4] = "Polka";
//
//        questionsAndAnswers[376][0] = "Which American dancer born in San Francisco paved the way for modern expressive dance?";
//        questionsAndAnswers[376][1] = "Isadora Duncan";
//        questionsAndAnswers[376][2] = "Fred Astire";
//        questionsAndAnswers[376][3] = "Ted Shawn";
//        questionsAndAnswers[376][4] = "Martha Graham";
//
//        questionsAndAnswers[377][0] = "Which American dancer was noted for his ability to run backwards?";
//        questionsAndAnswers[377][1] = "Bill (Bongangles) Robinson";
//        questionsAndAnswers[377][2] = "Arthur Murray";
//        questionsAndAnswers[377][3] = "Mikhail Baryshinkov";
//        questionsAndAnswers[377][4] = "Gene Kelly";
//
//        questionsAndAnswers[378][0] = "What item of clothing pushes out the back portion of a skirt to emphasize the hips and rear?";
//        questionsAndAnswers[378][1] = "Bustle";
//        questionsAndAnswers[378][2] = "Petticoat";
//        questionsAndAnswers[378][3] = "Crinoline";
//        questionsAndAnswers[378][4] = "Crinolette";
//
//        questionsAndAnswers[379][0] = "What is an outer garment worn by men over armor and by women as a large cloak?";
//        questionsAndAnswers[379][1] = "Surcoat";
//        questionsAndAnswers[379][2] = "Spencer";
//        questionsAndAnswers[379][3] = "Frock Coat";
//        questionsAndAnswers[379][4] = "Long Coat";
//
//        questionsAndAnswers[380][0] = "What is a long, narrow cloth streamer worn as an armband above the elbow?";
//        questionsAndAnswers[380][1] = "Tippet";
//        questionsAndAnswers[380][2] = "Ascot";
//        questionsAndAnswers[380][3] = "Sash";
//        questionsAndAnswers[380][4] = "Stole";
//
//        questionsAndAnswers[381][0] = "Who was the Governor of New Jersey from 2008 to 2018?";
//        questionsAndAnswers[381][1] = "Chris Christie";
//        questionsAndAnswers[381][2] = "Al Gore";
//        questionsAndAnswers[381][3] = "Rudy Giullani";
//        questionsAndAnswers[381][4] = "Phil Murphy";
//
//        questionsAndAnswers[382][0] = "Who defeated the Vikings at the end of the 9th century?";
//        questionsAndAnswers[382][1] = "Alfred The Great";
//        questionsAndAnswers[382][2] = "King Canute";
//        questionsAndAnswers[382][3] = "King William";
//        questionsAndAnswers[382][4] = "King John";
//
//
//        questionsAndAnswers[383][0] = "What is the most festive Jewish Holliday?";
//        questionsAndAnswers[383][1] = "Purim";
//        questionsAndAnswers[383][2] = "Yom Kippur";
//        questionsAndAnswers[383][3] = "Rose Hashanah";
//        questionsAndAnswers[383][4] = "Hanukkah";
//
//        questionsAndAnswers[384][0] = "When did potato famine in Ireland lead to great numbers of deaths owing to starvation and disease?";
//        questionsAndAnswers[384][1] = "Mid 19th Century";
//        questionsAndAnswers[384][2] = "Mid 18th Century";
//        questionsAndAnswers[384][3] = "Mid 17th Century";
//        questionsAndAnswers[384][4] = "Mid 16th Century";
//
//        questionsAndAnswers[385][0] = "Which play be Eugine O Neill is a trilogy based on Aeschylus Oresteia?";
//        questionsAndAnswers[385][1] = "Mourning Becomes Electra";
//        questionsAndAnswers[385][2] = "The Iceman Cometh";
//        questionsAndAnswers[385][3] = "Long Days Journey Into Night";
//        questionsAndAnswers[385][4] = "Strange Intelude";
//
//        questionsAndAnswers[386][0] = "Who painted a gruesome portrait of married life in the play Who’s Afraid of Virginia Woolf?";
//        questionsAndAnswers[386][1] = "Edward Albee";
//        questionsAndAnswers[386][2] = "Arthur Miller";
//        questionsAndAnswers[386][3] = "Oscar Wild";
//        questionsAndAnswers[386][4] = "Noel Coward";
//
//        questionsAndAnswers[387][0] = "What is the smallest bird?";
//        questionsAndAnswers[387][1] = "Bee Hummingbird";
//        questionsAndAnswers[387][2] = "Robin";
//        questionsAndAnswers[387][3] = "Blue tit";
//        questionsAndAnswers[387][4] = "Albatross";
//
//        questionsAndAnswers[388][0] = "\"He must increase but i must decrease\" is a quote from John 3:30. Who made the statement?";
//        questionsAndAnswers[388][1] = "John the Baptist";
//        questionsAndAnswers[388][2] = "Jesus";
//        questionsAndAnswers[388][3] = "Paul";
//        questionsAndAnswers[388][4] = "Peter";
//
//        questionsAndAnswers[389][0] = "Who fought each other during the hundred years war?";
//        questionsAndAnswers[389][1] = "England and France";
//        questionsAndAnswers[389][2] = "Spain and Germany";
//        questionsAndAnswers[389][3] = "Italy and Spain";
//        questionsAndAnswers[389][4] = "France and Germany";
//
//        questionsAndAnswers[390][0] = "Which US State is famous for Whoopie Pies?";
//        questionsAndAnswers[390][1] = "Maine";
//        questionsAndAnswers[390][2] = "New York";
//        questionsAndAnswers[390][3] = "Missouri";
//        questionsAndAnswers[390][4] = "California";
//
//        questionsAndAnswers[391][0] = "Which Animal name comes from Ancient Greek and means River Horse?";
//        questionsAndAnswers[391][1] = "Hippopotamus";
//        questionsAndAnswers[391][2] = "Frog";
//        questionsAndAnswers[391][3] = "Shark";
//        questionsAndAnswers[391][4] = "Turtle";
//
//        questionsAndAnswers[392][0] = "What are the main colors on the flag of Spain?";
//        questionsAndAnswers[392][1] = "Red and Yellow";
//        questionsAndAnswers[392][2] = "Black and Yellow";
//        questionsAndAnswers[392][3] = "Red and Blue";
//        questionsAndAnswers[392][4] = "White and Orange";
//
//        questionsAndAnswers[393][0] = "Where was Edgar Allan Poe born?";
//        questionsAndAnswers[393][1] = "Boston";
//        questionsAndAnswers[393][2] = "London";
//        questionsAndAnswers[393][3] = "Venice";
//        questionsAndAnswers[393][4] = "Paris";
//
//        questionsAndAnswers[394][0] = "What does MnM stand for?";
//        questionsAndAnswers[394][1] = "Mars and Murries";
//        questionsAndAnswers[394][2] = "Marvelous and Munches";
//        questionsAndAnswers[394][3] = "Mitchell and Millers";
//        questionsAndAnswers[394][4] = "Mark and Mindys";
//
//        questionsAndAnswers[395][0] = "What is the groove under the nose called?";
//        questionsAndAnswers[395][1] = "Philtrum";
//        questionsAndAnswers[395][2] = "Janeiro";
//        questionsAndAnswers[395][3] = "Petersham";
//        questionsAndAnswers[395][4] = "Rayon";
//
//        questionsAndAnswers[396][0] = "What year was Jimmy Carter sworn in as president?";
//        questionsAndAnswers[396][1] = "1977";
//        questionsAndAnswers[396][2] = "1984";
//        questionsAndAnswers[396][3] = "1974";
//        questionsAndAnswers[396][4] = "1980";
//
//        questionsAndAnswers[397][0] = "When did the Irish Famine take place?";
//        questionsAndAnswers[397][1] = "1845";
//        questionsAndAnswers[397][2] = "1810";
//        questionsAndAnswers[397][3] = "1925";
//        questionsAndAnswers[397][4] = "1895";
//
//        questionsAndAnswers[398][0] = "Which of these is NOT a component of a neuron?";
//        questionsAndAnswers[398][1] = "Hydrocephalus";
//        questionsAndAnswers[398][2] = "Myelin sheath";
//        questionsAndAnswers[398][3] = "Dendrites";
//        questionsAndAnswers[398][4] = "Terminal buttons";
//
//        questionsAndAnswers[399][0] = "What was the name of Franz Ferdinand’s assassin?";
//        questionsAndAnswers[399][1] = "Gavrilo Princip";
//        questionsAndAnswers[399][2] = "Edgar Allan Poe";
//        questionsAndAnswers[399][3] = "Lee Harvey Oswald";
//        questionsAndAnswers[399][4] = "John Wilkes Booth";
//
//        questionsAndAnswers[400][0] = "Which Disney movie did Demi Lovato Star in?";
//        questionsAndAnswers[400][1] = "Camp Rock";
//        questionsAndAnswers[400][2] = "Freaky Friday";
//        questionsAndAnswers[400][3] = "High School Musical";
//        questionsAndAnswers[400][4] = "The Parent Trap";
//
//        questionsAndAnswers[401][0] = "Ludo Bagman first appeared in what Harry Potter book?";
//        questionsAndAnswers[401][1] = "The Goblet of Fire";
//        questionsAndAnswers[401][2] = "The Half Blood Prince";
//        questionsAndAnswers[401][3] = "The Chamber of Secrets";
//        questionsAndAnswers[401][4] = "The Deathly Hallows";
//
//        questionsAndAnswers[402][0] = "Which of these noble ranks is highest?";
//        questionsAndAnswers[402][1] = "Duke";
//        questionsAndAnswers[402][2] = "Earl";
//        questionsAndAnswers[402][3] = "Baron";
//        questionsAndAnswers[402][4] = "Marquis";
//
//        questionsAndAnswers[403][0] = "Larry Hagman, the star of the TV drama that first ran from 1978 to 1991, \"Dallas\", is the son of which actress and singer?";
//        questionsAndAnswers[403][1] = "Mary Martin";
//        questionsAndAnswers[403][2] = "Julie Andrews";
//        questionsAndAnswers[403][3] = "Elaine Paige";
//        questionsAndAnswers[403][4] = "Mitzi Gaynor";
//
//        questionsAndAnswers[404][0] = "What is the name of the currency used in South Africa?";
//        questionsAndAnswers[404][1] = "South African Rand";
//        questionsAndAnswers[404][2] = "South African Dollar";
//        questionsAndAnswers[404][3] = "South African Pound";
//        questionsAndAnswers[404][4] = "South African Ruble";
//
//        questionsAndAnswers[405][0] = "Which of these is a keyboard instrument?";
//        questionsAndAnswers[405][1] = "Spinet";
//        questionsAndAnswers[405][2] = "Kazoo";
//        questionsAndAnswers[405][3] = "Sackbut";
//        questionsAndAnswers[405][4] = "Balalaika";
//
//        questionsAndAnswers[406][0] = "Which of these Canadian provinces is landlocked?";
//        questionsAndAnswers[406][1] = "Alberta";
//        questionsAndAnswers[406][2] = "British Columbia ";
//        questionsAndAnswers[406][3] = "Manitoba";
//        questionsAndAnswers[406][4] = "Ontario";
//
//        questionsAndAnswers[407][0] = "Washington D.C's nathional cathedral has what fictional character carved on its northwest tower?";
//        questionsAndAnswers[407][1] = "Darth Vader";
//        questionsAndAnswers[407][2] = "Superman ";
//        questionsAndAnswers[407][3] = "Spiderman";
//        questionsAndAnswers[407][4] = "Iron Man";
//
//        questionsAndAnswers[408][0] = "Which of these dog breeds is native to Tibet?";
//        questionsAndAnswers[408][1] = "Lhasa Apso";
//        questionsAndAnswers[408][2] = "Borzoi";
//        questionsAndAnswers[408][3] = "Klee Kai";
//        questionsAndAnswers[408][4] = "Bichon Frise";
//
//        questionsAndAnswers[409][0] = "What is the capital of Namibia?";
//        questionsAndAnswers[409][1] = "Windhoek";
//        questionsAndAnswers[409][2] = "Luanda";
//        questionsAndAnswers[409][3] = "Khartoum";
//        questionsAndAnswers[409][4] = "Nairobi";
//
//        questionsAndAnswers[410][0] = "In 1958, the Dodgers baseball team moved to Los Angeles from where?";
//        questionsAndAnswers[410][1] = "Brooklyn, New York";
//        questionsAndAnswers[410][2] = "Cincinnati, Ohio";
//        questionsAndAnswers[410][3] = "Washington, DC";
//        questionsAndAnswers[410][4] = "Salem, Oregon";
//
//        questionsAndAnswers[411][0] = "Dr. Carl Reinhold August Wunderlich is widely credited with establishing the human body's \"normal\" what?";
//        questionsAndAnswers[411][1] = "Temperature";
//        questionsAndAnswers[411][2] = "Blood Pressure";
//        questionsAndAnswers[411][3] = "Pulse Rate";
//        questionsAndAnswers[411][4] = "Glucose levels";
//
//
//        questionsAndAnswers[412][0] = "Wrigleyville is a neighborhood in which American city?";
//        questionsAndAnswers[412][1] = "Chicago";
//        questionsAndAnswers[412][2] = "New York";
//        questionsAndAnswers[412][3] = "Boston";
//        questionsAndAnswers[412][4] = "Memphis";
//
//        questionsAndAnswers[413][0] = "Who sculpted The Harp, a piece inspired by the poem “Lift Every Voice and Sing” by James Weldon Johnson?";
//        questionsAndAnswers[413][1] = "Augusta Savage";
//        questionsAndAnswers[413][2] = "Anna Hyatt Huntington";
//        questionsAndAnswers[413][3] = "Helen Farnsworth Mears";
//        questionsAndAnswers[413][4] = "John Skeaping";
//
//        questionsAndAnswers[414][0] = "What soft-drink company introduced the brand Slice?";
//        questionsAndAnswers[414][1] = "Coca-Cola";
//        questionsAndAnswers[414][2] = "Dr. Pepper";
//        questionsAndAnswers[414][3] = "Lilt";
//        questionsAndAnswers[414][4] = "Seven Up";
//
//        questionsAndAnswers[415][0] = "In the Lord of the Rings, which name do the Elves use to call the Hobbits?";
//        questionsAndAnswers[415][1] = "The Periannath";
//        questionsAndAnswers[415][2] = "The Mellon";
//        questionsAndAnswers[415][3] = "The Onodrim";
//        questionsAndAnswers[415][4] = "The Baggins";
//
//        questionsAndAnswers[416][0] = "Marzipan is made with what kind of nut?";
//        questionsAndAnswers[416][1] = "Almond";
//        questionsAndAnswers[416][2] = "Cashew";
//        questionsAndAnswers[416][3] = "Peanut";
//        questionsAndAnswers[416][4] = "Walnut";
//
//        questionsAndAnswers[417][0] = "According to Edward Lear, who went to sea in a sieve?";
//        questionsAndAnswers[417][1] = "Jumblies";
//        questionsAndAnswers[417][2] = "Yahoos";
//        questionsAndAnswers[417][3] = "Lilliputians";
//        questionsAndAnswers[417][4] = "The Owl and the Pussycat";
//
//        questionsAndAnswers[418][0] = "The internal angles of a pentagon add up to how many degrees?";
//        questionsAndAnswers[418][1] = "540";
//        questionsAndAnswers[418][2] = "360";
//        questionsAndAnswers[418][3] = "180";
//        questionsAndAnswers[418][4] = "720";
//
//        questionsAndAnswers[419][0] = "Autolyse is used is a technique often used in what?";
//        questionsAndAnswers[419][1] = "Baking Bread";
//        questionsAndAnswers[419][2] = "Fixing Cars";
//        questionsAndAnswers[419][3] = "Playing Baseball";
//        questionsAndAnswers[419][4] = "Shearing Wool";
//
//        questionsAndAnswers[420][0] = "Which of these seven wonders of the ancinet world was built around 300 bc?";
//        questionsAndAnswers[420][1] = "Colossus of Rhodes";
//        questionsAndAnswers[420][2] = "Statue of Zeus";
//        questionsAndAnswers[420][3] = "Pyramid of Giza";
//        questionsAndAnswers[420][4] = "The Temple of Artemis";
//
//        questionsAndAnswers[421][0] = "What is the name of the transition from a liquid state directly to a gas of an element or compound?";
//        questionsAndAnswers[421][1] = "Vaporisation";
//        questionsAndAnswers[421][2] = "Ionisation";
//        questionsAndAnswers[421][3] = "Deionisation";
//        questionsAndAnswers[421][4] = "Condensation";
//
//        questionsAndAnswers[422][0] = "What does Orangutan mean in the Malay language?";
//        questionsAndAnswers[422][1] = "Man of the Forest";
//        questionsAndAnswers[422][2] = "Man of Nature";
//        questionsAndAnswers[422][3] = "Beauty of the Forest";
//        questionsAndAnswers[422][4] = "Beauty of Nature";
//
//        questionsAndAnswers[423][0] = "What animal is pregnant for the shortest time?";
//        questionsAndAnswers[423][1] = "Opossum";
//        questionsAndAnswers[423][2] = "Sharks";
//        questionsAndAnswers[423][3] = "Wales";
//        questionsAndAnswers[423][4] = "Dolphins";
//
//        questionsAndAnswers[424][0] = "Electroreception skills are shown by which creature?";
//        questionsAndAnswers[424][1] = "Sharks";
//        questionsAndAnswers[424][2] = "Saola";
//        questionsAndAnswers[424][3] = "Ti-Liger";
//        questionsAndAnswers[424][4] = "Senca White Deer";
//
//        questionsAndAnswers[425][0] = "Which of the following part of the Sun is visible at the time of the eclipse?";
//        questionsAndAnswers[425][1] = "Corona";
//        questionsAndAnswers[425][2] = "Photosphere";
//        questionsAndAnswers[425][3] = "Chromosphere";
//        questionsAndAnswers[425][4] = "Core";
//
//        questionsAndAnswers[426][0] = "Which is the deepest point from the sea level on the Earth?";
//        questionsAndAnswers[426][1] = "Mariana Trench";
//        questionsAndAnswers[426][2] = "North Channel";
//        questionsAndAnswers[426][3] = "Red Sea";
//        questionsAndAnswers[426][4] = "Black Sea";
//
//        questionsAndAnswers[427][0] = "Which of the following is NOT a greenhouse gas?";
//        questionsAndAnswers[427][1] = "Helium";
//        questionsAndAnswers[427][2] = "Water vapour";
//        questionsAndAnswers[427][3] = "Nitrous oxide";
//        questionsAndAnswers[427][4] = "Surface level ozone";
//
//        questionsAndAnswers[428][0] = "From which among the following parts of a plant is Cinnamon obtained?";
//        questionsAndAnswers[428][1] = "Bark";
//        questionsAndAnswers[428][2] = "Leaves";
//        questionsAndAnswers[428][3] = "Seeds";
//        questionsAndAnswers[428][4] = "Buds";
//
//        questionsAndAnswers[429][0] = "Which Vitamin is also known as Folic Acid?";
//        questionsAndAnswers[429][1] = "B9";
//        questionsAndAnswers[429][2] = "B12";
//        questionsAndAnswers[429][3] = "B1";
//        questionsAndAnswers[429][4] = "B2";
//
//        questionsAndAnswers[430][0] = "Which movie starred John Travolta as Tony Manero and featured music by the BeeGees?";
//        questionsAndAnswers[430][1] = "Saturday Night Fever";
//        questionsAndAnswers[430][2] = "Pulp Fiction";
//        questionsAndAnswers[430][3] = "Get Shorty";
//        questionsAndAnswers[430][4] = "Face Off";
//
//        questionsAndAnswers[431][0] = "Which element used to be known as quicksilver?";
//        questionsAndAnswers[431][1] = "Mercury";
//        questionsAndAnswers[431][2] = "Magnesium";
//        questionsAndAnswers[431][3] = "Gold";
//        questionsAndAnswers[431][4] = "Lead";
//
//        questionsAndAnswers[432][0] = "What is the official language of Angola?";
//        questionsAndAnswers[432][1] = "Portugese";
//        questionsAndAnswers[432][2] = "Spanish";
//        questionsAndAnswers[432][3] = "English";
//        questionsAndAnswers[432][4] = "Italian";
//
//        questionsAndAnswers[433][0] = "Which of the following is another name for white ant?";
//        questionsAndAnswers[433][1] = "Termite";
//        questionsAndAnswers[433][2] = "Wasp";
//        questionsAndAnswers[433][3] = "Mosquito";
//        questionsAndAnswers[433][4] = "Housefly";
//
//        questionsAndAnswers[434][0] = "Hyponatremia is a condition characterized by low levels of?";
//        questionsAndAnswers[434][1] = "Sodium in blood";
//        questionsAndAnswers[434][2] = "Iron in blood";
//        questionsAndAnswers[434][3] = "Copper in blood";
//        questionsAndAnswers[434][4] = "Zinc in blood";
//
//        questionsAndAnswers[435][0] = "Who succeeded Henry II as King of England?";
//        questionsAndAnswers[435][1] = "Richard I";
//        questionsAndAnswers[435][2] = "Stephen";
//        questionsAndAnswers[435][3] = "William II";
//        questionsAndAnswers[435][4] = "Edward V";
//
//        questionsAndAnswers[436][0] = "What plant does vanilla flavoring come from?";
//        questionsAndAnswers[436][1] = "Orchids";
//        questionsAndAnswers[436][2] = "Lilac";
//        questionsAndAnswers[436][3] = "Crocus";
//        questionsAndAnswers[436][4] = "Evergreen Tree";
//
//        questionsAndAnswers[437][0] = "A painkiller and fever reducer can be made from the bark of which tree?";
//        questionsAndAnswers[437][1] = "Willow";
//        questionsAndAnswers[437][2] = "Oak";
//        questionsAndAnswers[437][3] = "Beech";
//        questionsAndAnswers[437][4] = "Seqouia";
//
//        questionsAndAnswers[438][0] = "What is the female part of a plant called?";
//        questionsAndAnswers[438][1] = "Pistil";
//        questionsAndAnswers[438][2] = "Stamer";
//        questionsAndAnswers[438][3] = "Antler";
//        questionsAndAnswers[438][4] = "Filament";
//
//        questionsAndAnswers[439][0] = "Which of the following measures the amount of damage done by an earthquake?";
//        questionsAndAnswers[439][1] = "Mercalli scale";
//        questionsAndAnswers[439][2] = "Richter Scale";
//        questionsAndAnswers[439][3] = "Kanamori Scale";
//        questionsAndAnswers[439][4] = "Selvaggi Scale";
//
//        questionsAndAnswers[440][0] = "What kind of scientist was Luther Burbank?";
//        questionsAndAnswers[440][1] = "Botanist";
//        questionsAndAnswers[440][2] = "Scientist";
//        questionsAndAnswers[440][3] = "Geologist";
//        questionsAndAnswers[440][4] = "Physicist";
//
//        questionsAndAnswers[441][0] = "Which of these bands were known to be a backing group for Elvis Presley?";
//        questionsAndAnswers[441][1] = "The Jordanaires";
//        questionsAndAnswers[441][2] = "The Jubalaries";
//        questionsAndAnswers[441][3] = "The Temptations";
//        questionsAndAnswers[441][4] = "The Four Tops";
//
//        questionsAndAnswers[442][0] = "Which country uses the Forints currency in 2022?";
//        questionsAndAnswers[442][1] = "Hungary";
//        questionsAndAnswers[442][2] = "Czech Republic";
//        questionsAndAnswers[442][3] = "Sweden";
//        questionsAndAnswers[442][4] = "Venezuela";
//
//        questionsAndAnswers[443][0] = "Who wrote the novel \"The shape of things to come\"?";
//        questionsAndAnswers[443][1] = "H.G Welles";
//        questionsAndAnswers[443][2] = "Jules Verne";
//        questionsAndAnswers[443][3] = "Robert Louis Stevenson";
//        questionsAndAnswers[443][4] = "Daniel Defoe";
//
//        questionsAndAnswers[444][0] = "What is Spike Milligan's first name?";
//        questionsAndAnswers[444][1] = "Terence";
//        questionsAndAnswers[444][2] = "Sean";
//        questionsAndAnswers[444][3] = "Michael";
//        questionsAndAnswers[444][4] = "Daniel";
//
//        questionsAndAnswers[445][0] = "Who invented dynamite?";
//        questionsAndAnswers[445][1] = "Alfred Nobel";
//        questionsAndAnswers[445][2] = "Robert Bunsen";
//        questionsAndAnswers[445][3] = "Sam Winchester";
//        questionsAndAnswers[445][4] = "Richard Jordan Gatlin";
//
//        questionsAndAnswers[446][0] = "Which of the following is NOT a mineral?";
//        questionsAndAnswers[446][1] = "Wood";
//        questionsAndAnswers[446][2] = "Salt";
//        questionsAndAnswers[446][3] = "Gold";
//        questionsAndAnswers[446][4] = "Diamond";
//
//
//        questionsAndAnswers[447][0] = "Bathilda Bagshot is a character in which of these series?";
//        questionsAndAnswers[447][1] = "Harry Potter";
//        questionsAndAnswers[447][2] = "The Hunger Games";
//        questionsAndAnswers[447][3] = "Twilight";
//        questionsAndAnswers[447][4] = "Lord of the Rings";
//
//        questionsAndAnswers[448][0] = "Didier Drogba played football for which London club?";
//        questionsAndAnswers[448][1] = "Chelsea";
//        questionsAndAnswers[448][2] = "Crystal Palace";
//        questionsAndAnswers[448][3] = "Arsenal";
//        questionsAndAnswers[448][4] = "West Ham";
//
//        questionsAndAnswers[449][0] = "Which NFL team had Bob Hope, Henry Mancini, Maureen Reagan and Danny Thomas on it's advisory board?";
//        questionsAndAnswers[449][1] = "Los Angeles Rams";
//        questionsAndAnswers[449][2] = "Miami Dolphins";
//        questionsAndAnswers[449][3] = "Philadelphia Eagles";
//        questionsAndAnswers[449][4] = "Baltimore Ravens";
//
//
//        questionsAndAnswers[450][0] = "Who played Maria Lucas in the mini-series \"Pride and Prejudice\" (1995) and Dawn Tinsley in the UK series \"The Office\" (2001)?";
//        questionsAndAnswers[450][1] = "Lucy Davis";
//        questionsAndAnswers[450][2] = "Stirling Gallacher";
//        questionsAndAnswers[450][3] = "Hayley Mills";
//        questionsAndAnswers[450][4] = "Kate Winslet";
//
//        questionsAndAnswers[451][0] = "What is a panatella?";
//        questionsAndAnswers[451][1] = "A Cigar";
//        questionsAndAnswers[451][2] = "A Dance";
//        questionsAndAnswers[451][3] = "A Drink";
//        questionsAndAnswers[451][4] = "A Scarf";
//
//        questionsAndAnswers[452][0] = "How old was Mary Queen of Scots when her father died and she accended to the throne?";
//        questionsAndAnswers[452][1] = "6 days";
//        questionsAndAnswers[452][2] = "6 months";
//        questionsAndAnswers[452][3] = "6 weeks";
//        questionsAndAnswers[452][4] = "6 years";
//
//        questionsAndAnswers[453][0] = "Which of these is a play by Anton Chekov?";
//        questionsAndAnswers[453][1] = "Three Sisters";
//        questionsAndAnswers[453][2] = "Four Brothers";
//        questionsAndAnswers[453][3] = "Man Alone";
//        questionsAndAnswers[453][4] = "Pair of Twits";
//
//        questionsAndAnswers[454][0] = "Which of the following awards is often referred to as the Nobel Prize in architecture?";
//        questionsAndAnswers[454][1] = "Pritzker Architecture Prize";
//        questionsAndAnswers[454][2] = "Royal Gold Medal";
//        questionsAndAnswers[454][3] = "LEAF Award";
//        questionsAndAnswers[454][4] = "National Building Award";
//
//        questionsAndAnswers[455][0] = "Where was the Disney film Pocahontas set?";
//        questionsAndAnswers[455][1] = "Tsenacommacah";
//        questionsAndAnswers[455][2] = "Burnley";
//        questionsAndAnswers[455][3] = "Montreal";
//        questionsAndAnswers[455][4] = "Glasgow";
//
//        questionsAndAnswers[456][0] = "Who sang the song Under The Sea in the film The Little Mermaid?";
//        questionsAndAnswers[456][1] = "Sebastian";
//        questionsAndAnswers[456][2] = "Pascal";
//        questionsAndAnswers[456][3] = "Dory";
//        questionsAndAnswers[456][4] = "Baloo";
//
//
//        questionsAndAnswers[457][0] = "The design of the Sydney Opera House in Australia is inspired by what?";
//        questionsAndAnswers[457][1] = "Sails of boats";
//        questionsAndAnswers[457][2] = "Seashells";
//        questionsAndAnswers[457][3] = "Glaciers";
//        questionsAndAnswers[457][4] = "Pine Trees";
//
//
//        questionsAndAnswers[458][0] = "What French cheese is considered to be the 'bluest' cheese in the world?";
//        questionsAndAnswers[458][1] = "Roquefort";
//        questionsAndAnswers[458][2] = "Gorgonzola";
//        questionsAndAnswers[458][3] = "Dolcelatte";
//        questionsAndAnswers[458][4] = "Saint Agur";
//
//        questionsAndAnswers[459][0] = "Who was the director of the C.I.A from 1976-1981?";
//        questionsAndAnswers[459][1] = "George H.W Bush";
//        questionsAndAnswers[459][2] = "John Mccone";
//        questionsAndAnswers[459][3] = "Porter J Goss";
//        questionsAndAnswers[459][4] = "William J Casey";
//
//        questionsAndAnswers[460][0] = "Which decade was Drew Barrymore born?";
//        questionsAndAnswers[460][1] = "1970s";
//        questionsAndAnswers[460][2] = "1980s";
//        questionsAndAnswers[460][3] = "1990s";
//        questionsAndAnswers[460][4] = "1960s";
//
//        questionsAndAnswers[461][0] = "Who is the only US President who did not speak English as his first language?";
//        questionsAndAnswers[461][1] = "Martin Van Buren";
//        questionsAndAnswers[461][2] = "James A. Garfield";
//        questionsAndAnswers[461][3] = "James Polk";
//        questionsAndAnswers[461][4] = "Rutherford B. Hayes";
//
//        questionsAndAnswers[462][0] = "Which musical term means \"Slow\"?";
//        questionsAndAnswers[462][1] = "Lento";
//        questionsAndAnswers[462][2] = "Dolce";
//        questionsAndAnswers[462][3] = "Fugato";
//        questionsAndAnswers[462][4] = "Sostenuto";
//
//        questionsAndAnswers[463][0] = "Bangladesh declared independence from which country on 26 March 1971?";
//        questionsAndAnswers[463][1] = "Pakistan";
//        questionsAndAnswers[463][2] = "Afghanistan";
//        questionsAndAnswers[463][3] = "India";
//        questionsAndAnswers[463][4] = "Sri Lanka";
//
//        questionsAndAnswers[464][0] = "What were the first names of author D H Lawrence?";
//        questionsAndAnswers[464][1] = "David Herbert";
//        questionsAndAnswers[464][2] = "Dennis Harold";
//        questionsAndAnswers[464][3] = "Darwin Haversham";
//        questionsAndAnswers[464][4] = "Darren Hurst";
//
//        questionsAndAnswers[465][0] = "Who was Indiana Jones' 11 year old Chinese sidekick in Indiana Jones and the Temple of Doom?";
//        questionsAndAnswers[465][1] = "Short Round";
//        questionsAndAnswers[465][2] = "Hop Sing";
//        questionsAndAnswers[465][3] = "Charlie Chan";
//        questionsAndAnswers[465][4] = "Cato Fong";
//
//        questionsAndAnswers[466][0] = "The Bowl of Hygieia is a symbol of what profession?";
//        questionsAndAnswers[466][1] = "Pharmacy";
//        questionsAndAnswers[466][2] = "Painting";
//        questionsAndAnswers[466][3] = "Plumbing";
//        questionsAndAnswers[466][4] = "Building";
//
//        questionsAndAnswers[467][0] = "Which chess peice is only able to move on the same color?";
//        questionsAndAnswers[467][1] = "Bishop";
//        questionsAndAnswers[467][2] = "Knight";
//        questionsAndAnswers[467][3] = "Pawn";
//        questionsAndAnswers[467][4] = "Queen";
//
//        questionsAndAnswers[468][0] = "In scrabble, what are the two highest scoring letters?";
//        questionsAndAnswers[468][1] = "Q and Z";
//        questionsAndAnswers[468][2] = "X and Y";
//        questionsAndAnswers[468][3] = "R and U";
//        questionsAndAnswers[468][4] = "B and C";
//
//        questionsAndAnswers[469][0] = "What does the e stand for in the animal rights organization PETA?";
//        questionsAndAnswers[469][1] = "Ethical";
//        questionsAndAnswers[469][2] = "Equal";
//        questionsAndAnswers[469][3] = "Energy";
//        questionsAndAnswers[469][4] = "Emotional";
//
//        questionsAndAnswers[470][0] = "Which of these vitamins is found in quantity in sunflower oil?";
//        questionsAndAnswers[470][1] = "Vitamin E";
//        questionsAndAnswers[470][2] = "Vitamin B12";
//        questionsAndAnswers[470][3] = "Vitamin D";
//        questionsAndAnswers[470][4] = "Vitamin C";
//
//        questionsAndAnswers[471][0] = "Pogonophobia is the fear of what?";
//        questionsAndAnswers[471][1] = "Beards";
//        questionsAndAnswers[471][2] = "Trees";
//        questionsAndAnswers[471][3] = "Clowns";
//        questionsAndAnswers[471][4] = "Food";
//
//        questionsAndAnswers[472][0] = "Which of the Great Lakes is the only one located entirely within the USA?";
//        questionsAndAnswers[472][1] = "Lake Michigan";
//        questionsAndAnswers[472][2] = "Lake Superior";
//        questionsAndAnswers[472][3] = "Lake Erie";
//        questionsAndAnswers[472][4] = "Lake Huron";
//
//        questionsAndAnswers[473][0] = "Elle Macpherson was born in what country?";
//        questionsAndAnswers[473][1] = "Australia";
//        questionsAndAnswers[473][2] = "Germany";
//        questionsAndAnswers[473][3] = "Canada";
//        questionsAndAnswers[473][4] = "South Africa";
//
//        questionsAndAnswers[474][0] = "Rialto bridge is in which Italian city?";
//        questionsAndAnswers[474][1] = "Venice";
//        questionsAndAnswers[474][2] = "Milan";
//        questionsAndAnswers[474][3] = "Rome";
//        questionsAndAnswers[474][4] = "Florence";
//
//        questionsAndAnswers[475][0] = "What are Mondopoint, Paris point and barleycorn?";
//        questionsAndAnswers[475][1] = "Shoe sizing";
//        questionsAndAnswers[475][2] = "Positions in fencing";
//        questionsAndAnswers[475][3] = "Embroidery stitches";
//        questionsAndAnswers[475][4] = "Decorative facings in architecture";
//
//        questionsAndAnswers[476][0] = "The song \"Stranger in Paradise\", first released in 1953, is taken from music by which composer?";
//        questionsAndAnswers[476][1] = "Alexander Borodin";
//        questionsAndAnswers[476][2] = "Vittorio Monti";
//        questionsAndAnswers[476][3] = "Giacomo Puccini";
//        questionsAndAnswers[476][4] = "Sergei Rachmaninoff";
//
//
//        questionsAndAnswers[477][0] = "Which of these is not a rodent?";
//        questionsAndAnswers[477][1] = "Skunk";
//        questionsAndAnswers[477][2] = "Chinchilla";
//        questionsAndAnswers[477][3] = "Rat";
//        questionsAndAnswers[477][4] = "Prairie dog";
//
//        questionsAndAnswers[478][0] = "The Tarantula is named after a town in which country?";
//        questionsAndAnswers[478][1] = "Italy";
//        questionsAndAnswers[478][2] = "Spain";
//        questionsAndAnswers[478][3] = "Mexico";
//        questionsAndAnswers[478][4] = "Greece";
//
//        questionsAndAnswers[479][0] = "Who created the comic strip \"Garfield\"?";
//        questionsAndAnswers[479][1] = "Jim Davis";
//        questionsAndAnswers[479][2] = "Jim Henson";
//        questionsAndAnswers[479][3] = "Garry Trudeau";
//        questionsAndAnswers[479][4] = "Charlie Chaplin";
//
//        questionsAndAnswers[480][0] = "Which English King was the father of King John and Richard the Lionheart?";
//        questionsAndAnswers[480][1] = "Henry II";
//        questionsAndAnswers[480][2] = "William II";
//        questionsAndAnswers[480][3] = "Richard II";
//        questionsAndAnswers[480][4] = "Edward II";
//
//        questionsAndAnswers[481][0] = "Which actress debuted in US slasher film \"Halloween\" (1978)?";
//        questionsAndAnswers[481][1] = "Jamie Lee Curtis";
//        questionsAndAnswers[481][2] = "Drew Barrymore";
//        questionsAndAnswers[481][3] = "Olivia Newton John";
//        questionsAndAnswers[481][4] = "Sissy Spacek";
//
//        questionsAndAnswers[482][0] = "What woman became the first Olympic athlete to win gold twice 20 years apart?";
//        questionsAndAnswers[482][1] = "Brigit Fischer";
//        questionsAndAnswers[482][2] = "Nadia Comaneci";
//        questionsAndAnswers[482][3] = "Serena Williams";
//        questionsAndAnswers[482][4] = "Paula Radcliffe";
//
//        questionsAndAnswers[483][0] = "What does the Latin root of the word \"meticulous\" mean?";
//        questionsAndAnswers[483][1] = "Fear";
//        questionsAndAnswers[483][2] = "Care";
//        questionsAndAnswers[483][3] = "Happy";
//        questionsAndAnswers[483][4] = "Curious";
//
//        questionsAndAnswers[484][0] = "Which of these is a type of bat?";
//        questionsAndAnswers[484][1] = "Pipistrelle";
//        questionsAndAnswers[484][2] = "Ptarmigan";
//        questionsAndAnswers[484][3] = "Palomino";
//        questionsAndAnswers[484][4] = "Protea";
//
//        questionsAndAnswers[485][0] = "What element has the symbol \"P\"?";
//        questionsAndAnswers[485][1] = "Phosphorus";
//        questionsAndAnswers[485][2] = "Potassium";
//        questionsAndAnswers[485][3] = "Platinum";
//        questionsAndAnswers[485][4] = "Carbon";
//
//
//        questionsAndAnswers[486][0] = "The American TV series Twin Peakes was set in which US State?";
//        questionsAndAnswers[486][1] = "Washington";
//        questionsAndAnswers[486][2] = "New York";
//        questionsAndAnswers[486][3] = "Los Angeles";
//        questionsAndAnswers[486][4] = "Florida";
//
//
//        questionsAndAnswers[487][0] = "What is a Russian Blue?";
//        questionsAndAnswers[487][1] = "Cat";
//        questionsAndAnswers[487][2] = "Parrot";
//        questionsAndAnswers[487][3] = "Dog";
//        questionsAndAnswers[487][4] = "Sheep";
//
//        questionsAndAnswers[488][0] = "Who was the first recorded Olympic champion?";
//        questionsAndAnswers[488][1] = "Coroebus of Elis";
//        questionsAndAnswers[488][2] = "Astylos of Croton";
//        questionsAndAnswers[488][3] = "Milo of Croton";
//        questionsAndAnswers[488][4] = "Leonidas of Rhodes";
//
//        questionsAndAnswers[489][0] = "Before the world knew him as \"The Science guy\" what was Bill Nye's profession?";
//        questionsAndAnswers[489][1] = "Stand up comic";
//        questionsAndAnswers[489][2] = "Carpenter";
//        questionsAndAnswers[489][3] = "Puppeteer";
//        questionsAndAnswers[489][4] = "Morning TV news host";
//
//
//        questionsAndAnswers[490][0] = "In 1768, Captain James Cook set out to explore which ocean?";
//        questionsAndAnswers[490][1] = "Pacific";
//        questionsAndAnswers[490][2] = "Atlantic";
//        questionsAndAnswers[490][3] = "Indian";
//        questionsAndAnswers[490][4] = "Arctic";
//
//        questionsAndAnswers[491][0] = "A murder is a group of what birds?";
//        questionsAndAnswers[491][1] = "Crows";
//        questionsAndAnswers[491][2] = "Pigeons";
//        questionsAndAnswers[491][3] = "Eagles";
//        questionsAndAnswers[491][4] = "Albatross";
//
//
//        questionsAndAnswers[492][0] = "Which of these seas is not part of the Mediterranean Sea?";
//        questionsAndAnswers[492][1] = "Coral Sea";
//        questionsAndAnswers[492][2] = "Ionian Sea";
//        questionsAndAnswers[492][3] = "Adriatic Sea";
//        questionsAndAnswers[492][4] = "Alboran Sea";
//
//        questionsAndAnswers[493][0] = "In which game would you use a wooden ball called a cochonnet?";
//        questionsAndAnswers[493][1] = "Boules";
//        questionsAndAnswers[493][2] = "Croquet";
//        questionsAndAnswers[493][3] = "Rounders";
//        questionsAndAnswers[493][4] = "Hockey";
//
//
//        questionsAndAnswers[494][0] = "Which of these colors has the shortest wavelength?";
//        questionsAndAnswers[494][1] = "Green";
//        questionsAndAnswers[494][2] = "Red";
//        questionsAndAnswers[494][3] = "Orange";
//        questionsAndAnswers[494][4] = "Yellow";
//
//
//        questionsAndAnswers[495][0] = "For the type of bet called a \"Quinella\", how many horses are picked?";
//        questionsAndAnswers[495][1] = "2";
//        questionsAndAnswers[495][2] = "3";
//        questionsAndAnswers[495][3] = "4";
//        questionsAndAnswers[495][4] = "5";
//
//        questionsAndAnswers[496][0] = "Which of these establishments is based in Langley, Virginia?";
//        questionsAndAnswers[496][1] = "CIA";
//        questionsAndAnswers[496][2] = "The Pentagon";
//        questionsAndAnswers[496][3] = "Harvard University";
//        questionsAndAnswers[496][4] = "FBI";
//
//        questionsAndAnswers[497][0] = "Which of these is a dance?";
//        questionsAndAnswers[497][1] = "Cotillion";
//        questionsAndAnswers[497][2] = "Derision";
//        questionsAndAnswers[497][3] = "Partition";
//        questionsAndAnswers[497][4] = "Derision";
//
//        questionsAndAnswers[498][0] = "Which brothers founded the studio which developed the dance rhythm game, Just Dance 2021?";
//        questionsAndAnswers[498][1] = "Guillemot";
//        questionsAndAnswers[498][2] = "Fleming";
//        questionsAndAnswers[498][3] = "Marx";
//        questionsAndAnswers[498][4] = "Seropian";
//
//        questionsAndAnswers[499][0] = "The cochela is which part of the body?";
//        questionsAndAnswers[499][1] = "Ear";
//        questionsAndAnswers[499][2] = "Nose";
//        questionsAndAnswers[499][3] = "Eye";
//        questionsAndAnswers[499][4] = "Mouth";


    }




    fun populateList(myList:ArrayList<String>){
        for(mytemp in 0..questionsAndAnswers.size-1){
            myList.add(questionsAndAnswers[mytemp][0])
        }

    }

    fun getAnswerList(question:String):ArrayList<String>{
        val choices = 4
        val temp =""
        val answerList = ArrayList<String>()

        for(j in 0..questionsAndAnswers.size-1){
            if(questionsAndAnswers[j][0]!=null&&questionsAndAnswers[j][0].equals(question)){
                for(k in 1..choices){
                    answerList.add(questionsAndAnswers[j][k])
                }
            }
        }
        return answerList

    }




}