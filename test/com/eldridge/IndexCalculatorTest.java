package com.eldridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexCalculatorTest {
    @Test
    public void givenSimpleCitationList_WhenCalculatingIndex_ThenCorrectIndexReturned() {
        List<Integer> citationList = new ArrayList<>();
        citationList.add(0);
        citationList.add(2);
        citationList.add(99);

        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(2, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenCitationList_WhenLastCitationIsTheIndexValue_ThenLastCitationIsReturned(){
        List<Integer> citationList = new ArrayList<>();
        citationList.add(1);
        citationList.add(1);
        citationList.add(3);
        citationList.add(2);

        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(2, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenCitationList_WhenFirstCitationIsTheIndexValue_ThenFirstCitationIsReturned(){
        List<Integer> citationList = new ArrayList<>();
        citationList.add(2);
        citationList.add(1);
        citationList.add(1);
        citationList.add(3);
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(2, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenComplexCitationList_WhenCalculatingCitation_ThenCorrectCitationIsReturned(){
        List<Integer> citationList = new ArrayList<>();
        citationList.add(1);
        citationList.add(5);
        citationList.add(2);
        citationList.add(5);
        citationList.add(3);
        citationList.add(1);
        citationList.add(5);
        citationList.add(5);
        citationList.add(6);
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(5, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenOneHundredRepeatingOutOfOrderCitationList_WhenCalculatingCitation_ThenCorrectCitationIsReturned(){
        Integer[] arrayIntegers = new Integer[]{1,5,4,5,2,5,3,1,7,4,5,1,5,2,1,5,1,7,5,2,5,3,1,1,5,1,5,2,5,3,1,1,5,7,1,5,2,5,3,1,5,5,6,1,5,2,5,3,1,5,5,6,1,5,2,5,3,7,1,5,5,6,1,5,2,5,3,1,5,5,6,1,7,5,2,5,3,1,5,5,6,1,5,2,5,3,1,5,7,5,6,2,5,3,1,5,5,6};
        List<Integer> citationList = new ArrayList<>(Arrays.asList(arrayIntegers));
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(6, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenOneThousandNonRepeatingOutOfOrderCitationList_WhenCalculatingCitation_ThenCorrectCitationIsReturned(){
        Integer[] arrayIntegers = new Integer[]{621, 922, 198, 353, 305, 138, 77, 599, 696, 519, 684, 483, 110, 50, 450, 649, 616, 893, 481, 631, 674, 75, 427, 312, 989, 858, 979, 508, 613, 82, 907, 925, 778, 480, 416, 258, 540, 548, 734, 873, 381, 369, 370, 747, 268, 30, 683, 188, 53, 843, 1, 342, 606, 526, 247, 972, 263, 471, 882, 505, 324, 365, 349, 270, 441, 502, 45, 690, 145, 813, 587, 14, 565, 558, 976, 332, 993, 393, 229, 281, 58, 472, 39, 217, 382, 220, 507, 664, 7, 287, 422, 917, 769, 855, 896, 493, 713, 470, 55, 390, 87, 535, 254, 423, 596, 20, 424, 542, 491, 761, 339, 504, 742, 927, 467, 280, 572, 741, 461, 78, 577, 289, 581, 644, 79, 455, 940, 57, 554, 752, 501, 376, 527, 836, 117, 494, 531, 588, 311, 485, 805, 170, 253, 490, 134, 946, 163, 914, 93, 949, 811, 373, 409, 842, 691, 582, 492, 947, 260, 910, 157, 629, 383, 355, 839, 894, 854, 482, 937, 328, 723, 584, 614, 73, 432, 17, 525, 628, 94, 985, 237, 600, 116, 32, 384, 564, 84, 777, 338, 528, 351, 911, 347, 862, 580, 773, 881, 109, 209, 129, 659, 550, 195, 398, 916, 560, 208, 671, 570, 919, 625, 132, 114, 240, 359, 851, 716, 651, 4, 184, 327, 121, 261, 292, 331, 905, 520, 456, 91, 725, 951, 447, 639, 251, 909, 215, 60, 115, 586, 988, 159, 193, 961, 341, 386, 941, 732, 49, 51, 47, 61, 166, 559, 522, 524, 569, 707, 808, 702, 52, 974, 257, 785, 284, 179, 385, 818, 19, 234, 591, 192, 948, 678, 712, 590, 272, 833, 151, 213, 214, 701, 210, 955, 499, 182, 103, 921, 400, 318, 744, 826, 466, 130, 439, 809, 3, 828, 131, 733, 141, 981, 739, 413, 929, 458, 124, 233, 107, 241, 884, 643, 536, 952, 786, 484, 721, 360, 950, 352, 206, 543, 498, 887, 824, 6, 65, 759, 500, 150, 593, 357, 388, 246, 43, 478, 487, 640, 945, 147, 699, 938, 448, 957, 729, 978, 760, 356, 394, 755, 474, 676, 792, 956, 476, 443, 573, 142, 633, 810, 694, 871, 849, 38, 645, 746, 436, 845, 578, 557, 878, 64, 243, 303, 177, 375, 211, 610, 680, 497, 362, 903, 939, 620, 242, 274, 468, 97, 395, 663, 171, 489, 415, 12, 259, 835, 545, 174, 784, 697, 15, 48, 431, 123, 296, 607, 95, 120, 317, 617, 35, 636, 969, 412, 670, 579, 269, 399, 806, 654, 767, 99, 936, 623, 619, 1000, 847, 236, 11, 10, 692, 288, 463, 232, 827, 126, 90, 72, 933, 200, 392, 549, 970, 934, 583, 695, 738, 743, 98, 9, 8, 886, 885, 944, 361, 589, 609, 571, 901, 430, 503, 626, 971, 488, 299, 231, 477, 637, 879, 634, 22, 718, 283, 566, 442, 677, 512, 537, 440, 88, 148, 681, 864, 552, 731, 509, 173, 762, 814, 745, 511, 815, 223, 67, 495, 765, 874, 168, 329, 69, 345, 958, 513, 541, 278, 127, 323, 538, 915, 444, 271, 181, 880, 244, 790, 876, 754, 425, 872, 249, 346, 906, 92, 768, 968, 140, 438, 669, 81, 426, 326, 870, 930, 336, 315, 595, 986, 160, 928, 2, 877, 433, 144, 13, 551, 532, 457, 201, 530, 967, 802, 859, 380, 983, 276, 630, 685, 783, 465, 18, 869, 735, 167, 371, 230, 252, 547, 26, 377, 306, 597, 403, 991, 774, 221, 624, 364, 562, 892, 796, 187, 366, 868, 608, 601, 119, 953, 80, 900, 647, 709, 62, 248, 411, 622, 308, 401, 122, 314, 797, 653, 913, 300, 464, 175, 912, 655, 736, 820, 749, 576, 688, 34, 959, 406, 389, 235, 330, 657, 113, 397, 446, 83, 748, 56, 402, 16, 313, 396, 112, 265, 656, 216, 682, 496, 379, 966, 96, 125, 646, 722, 724, 29, 404, 831, 178, 533, 291, 149, 33, 775, 42, 191, 309, 758, 27, 374, 652, 686, 926, 711, 207, 180, 703, 23, 135, 534, 414, 285, 517, 660, 817, 250, 650, 266, 807, 714, 672, 74, 700, 766, 429, 935, 128, 437, 822, 298, 751, 687, 995, 667, 781, 612, 635, 615, 883, 161, 28, 227, 320, 70, 794, 943, 920, 54, 420, 185, 553, 294, 803, 888, 568, 407, 962, 771, 101, 363, 5, 516, 521, 544, 282, 275, 218, 428, 226, 155, 205, 931, 611, 479, 698, 889, 344, 118, 239, 76, 618, 452, 337, 523, 335, 990, 641, 838, 66, 68, 25, 795, 387, 202, 169, 846, 973, 245, 856, 475, 358, 108, 756, 998, 102, 954, 918, 717, 789, 715, 165, 506, 737, 264, 996, 297, 750, 186, 963, 196, 705, 788, 648, 546, 830, 829, 812, 71, 819, 453, 891, 857, 897, 486, 793, 574, 757, 924, 980, 86, 378, 932, 728, 156, 333, 212, 563, 960, 841, 302, 434, 158, 304, 832, 719, 662, 277, 987, 706, 286, 154, 238, 800, 661, 136, 668, 417, 256, 63, 964, 454, 137, 658, 368, 898, 539, 37, 190, 627, 203, 334, 556, 997, 410, 801, 779, 780, 59, 307, 861, 638, 825, 460, 152, 816, 561, 852, 164, 418, 799, 853, 228, 555, 787, 143, 770, 975, 262, 726, 100, 348, 804, 222, 848, 865, 295, 473, 194, 105, 106, 902, 510, 372, 720, 585, 273, 435, 40, 225, 146, 224, 895, 999, 301, 763, 391, 776, 172, 899, 199, 632, 350, 605, 977, 354, 204, 41, 567, 310, 994, 890, 321, 290, 764, 850, 408, 665, 316, 834, 844, 451, 875, 791, 693, 24, 602, 923, 279, 730, 604, 325, 594, 31, 85, 340, 319, 592, 111, 689, 823, 772, 860, 867, 704, 740, 459, 267, 515, 529, 133, 449, 908, 965, 343, 840, 708, 782, 598, 419, 675, 518, 255, 984, 219, 679, 162, 421, 46, 942, 293, 367, 514, 863, 866, 405, 673, 183, 798, 36, 104, 21, 445, 176, 139, 821, 197, 322, 904, 992, 666, 89, 982, 642, 575, 189, 727, 603, 153, 44, 462, 837, 710, 753, 469};
        List<Integer> citationList = new ArrayList<>(Arrays.asList(arrayIntegers));
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(500, underTest.calculateIndex(citationList));
    }

    @Test
    public void givenOneToTenCitationList_WhenCalculatingCitation_ThenCorrectCitationIsReturned(){
        Integer[] arrayIntegers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> citationList = new ArrayList<>(Arrays.asList(arrayIntegers));
        IndexCalculator underTest = new IndexCalculator();
        Assertions.assertEquals(5, underTest.calculateIndex(citationList));
    }
}
