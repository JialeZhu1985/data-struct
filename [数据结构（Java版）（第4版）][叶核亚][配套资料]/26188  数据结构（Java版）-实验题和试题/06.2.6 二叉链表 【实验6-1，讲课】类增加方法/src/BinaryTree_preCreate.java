//�����ݽṹ��Java�棩����4�棩����⡷�����ߣ�Ҷ���ǣ�2015��8��6��
//6.2.6   �������Ķ�������ʵ��
//����6.1��  �������Ĺ��졢���������롣 
//������6��  ���������������ʹ��˳��ѭ�����еı仯ͼ��

public class BinaryTree_preCreate 
{
    static String[][] prelist={          //�������������������ȸ�����
        {"A","B","S",null,"T","R",null,null,null,"C",null,null, "L","O",null,"N",null,null,"G"}, //abstractlong
        {"I","N","S",null,"T",null,null,"A",null,null, "C","E","O",null,null,null,"F"},          //instanceof
        {"P","U","B","L",null,null,"I",null,null,"C",null,null, "R","E",null,"A",null,null,"K"}, //publicbreak
        {"S","Y","M","P",null,null,"A",null,null,"T",null,"H",null,null, "E","I",null,"C"},      //sympathetic ͬ���
        {"T","R","A",null,"N","S",null,null,null,"I","E",null,null,null, "V",null,"O","D"},      //transientVoid
        {"U","M",null,"B","R","E",null,null,null,"L","A",null,null,null, "F",null,"O","T"}};     //umbrellaFloat��ɡ
    
    public static void main(String[] args) 
    {
        BinaryTree<String> bitree = new BinaryTree<String>(prelist[5]);
        System.out.println("���������ȸ�����������У�  "+bitree.toString());  //����������
        System.out.print("���������и�����������У�  ");  bitree.inorder();
        System.out.print("�������ĺ������������У�  ");  bitree.postorder();
        bitree.levelorder();                               //��α���������
        bitree.printGenList(); 
    }
}
/*
�������н�����£�10~11����㣬����ֵ����  
�ȸ����������������  A B S ��T R �ġġ�C �ġ�L O ��N �ġ�G �ġ�  //abstractlong��10�����
�и����������������  S R T B C A O N L G 
������������������  R T S C B N O G L A 
��α�����������  A B L S C O G T N R 
�������Ĺ�����ʾ��A(B(S(��,T(R,��)),C),L(O(��,N),G))

�ȸ����������������  I N S ��T �ġ�A �ġ�C E O �ġġ�F �ġ�     //instanceof��9�����
�и����������������  S T N A I O E C F 
������������������  T S A N O E F C I 
��α�����������  I N C S A E F T O 
�������Ĺ�����ʾ��I(N(S(��,T),A),C(E(O,��),F))

�ȸ����������������  P U B L �ġ�I �ġ�C �ġ�R E ��A �ġ�K �ġ�  //publicbreak��10�����
�и����������������  L B I U C P E A R K 
������������������  L I B C U A E K R P 
��α�����������  P U R B C E K L I A 
�������Ĺ�����ʾ��P(U(B(L,I),C),R(E(��,A),K))
 
�ȸ����������������  S Y M P �ġ�A �ġ�T ��H �ġ�E I ��C �ġġ�   //sympatheticͬ��ģ�10�����
�и����������������  P M A Y T H S I C E 
������������������  P A M H T Y C I E S 
��α�����������  S Y E M T I P A H C 
�������Ĺ�����ʾ��S(Y(M(P,A),T(��,H)),E(I(��,C),��))

�ȸ����������������  T R A ��N S �ġġ�I E �ġġ�V ��O D �ġġ�   //transientVoid
�и����������������  A S N R E I T V D O 
������������������  S N A E I R D O V T 
��α�����������  T R V A I O N E D S 
�������Ĺ�����ʾ��T(R(A(��,N(S,��)),I(E,��)),V(��,O(D,��)))
 
�ȸ����������������  U M ��B R E �ġġ�L A �ġġ�F ��O T �ġġ�   //umbrellaFloat��ɡ
�и����������������  M E R B A L U F T O 
������������������  E R A L B M T O F U 
��α�����������  U M F B O R L T E A 
�������Ĺ�����ʾ��U(M(��,B(R(E,��),L(A,��))),F(��,O(T,��)))

    //�ؼ��ֱ�
    private static String[] ={"","assert","boolean","break","byte","case","catch",
        "char","class","continue","default","do","","else","extends","false","final","finally",
        "float","for","if","implements","import","int","interface","","native","new",
        "package","private","protected","public","return","short","static","super","switch",
        "synchronized","this","throw","throws","","true","try","void","volatile","while"};

*/
//@author��Yeheya��2015-8-8