package HashTable;

class Hash{
    private class Rows{
        private class LinkedList {
            private class Node{
                private int data;
                private Node nextNode;
            
                Node(int data){
                    this.data= data;
                    this.nextNode= null;
                }
            }
        
            private Node head, tail;
        
            LinkedList(){
                this.head= null;
                this.tail= null;
            }
        
            private void insert(int data){
                if(this.search(data)){
                    System.out.println("Angka "+data+" sudah ada dalam key list, insert dibatalkan");
                    return;
                }

                Node newNode= new Node(data);

                if(this.head==null){
                    this.head= newNode;
                    this.tail= newNode;
                }else{
                    this.tail.nextNode= newNode;
                    this.tail= newNode;
                }
            }

            private boolean search(int data){
                Node currNode= this.head;

                while(this.head!=null && currNode.nextNode!=null){
                    if(currNode.data==data || currNode.nextNode.data==data) return true;
                    currNode= currNode.nextNode;
                }

                return false;
            }

            private boolean delete(int data){
                if(this.head==null || this.head.nextNode==null && this.head.data!=data) return false;
                if(this.head.data==data) {
                    this.head= this.head.nextNode;
                    return true;
                }
                else if(this.head.nextNode.data==data){
                    this.head.nextNode= null;
                    this.tail= this.head;

                    return true;
                }

                Node currNode= this.head;

                while(this.head!=null && currNode.nextNode.nextNode!=null){
                    if(currNode.nextNode.data==data || currNode.nextNode.nextNode.data==data) {
                        if(currNode.nextNode.nextNode==this.tail) {
                            currNode.nextNode.nextNode= null;
                            this.tail= currNode.nextNode;
                        }
                        else currNode.nextNode= currNode.nextNode.nextNode;
                        return true;
                    }
                    currNode= currNode.nextNode;
                }
                
                return false;
            }
        
            private String displayLinkedList(){
                return (head==null)? "null" : (executeDisplayLinkedList(this.head));
            }
        
            private String executeDisplayLinkedList(Node node){
                return (node.nextNode==null)? node.data+"" : node.data+" -> "+executeDisplayLinkedList(node.nextNode);
            }
        
        }

        private int index, hashValue;
        private LinkedList keyList= new LinkedList();

        Rows(int index, int hashValue){
            this.index= index;
            this.hashValue= hashValue;
        }

        private void insertKey(int data){
            this.keyList.insert(data);
        }

        private void searchKey(int data){
            System.out.println("Angka "+data+ ((this.keyList.search(data))? (" berada pada indeks "+this.index) : (" tidak berada pada indeks manapun")));
        }

        private void deleteKey(int data){
            System.out.println("Angka "+data+ ((this.keyList.delete(data))? (" terhapus") : (" tidak berada pada indeks manapun")));
        }

    }

    private int maxIndex= 5;
    private Rows [] rows;

    Hash(){
        rows= new Rows[maxIndex];
        addingRow();
    }

    Hash(int maxIndex){
        this.maxIndex= maxIndex;
        rows= new Rows[this.maxIndex];
        addingRow();
    }

    private int hashFunctionValue(int index){
        return index%this.maxIndex;
    }

    private void addingRow(){
        for(int i=0; i<this.rows.length; i++) this.rows[i]= new Rows(i, hashFunctionValue(i));
    }

    public void insert(int data){
        this.rows[hashFunctionValue(data)].insertKey(data);
    }

    public void search(int data){
        this.rows[hashFunctionValue(data)].searchKey(data);
    }

    public void delete(int data){
        this.rows[hashFunctionValue(data)].deleteKey(data);
    }

    public void display(){
        System.out.println("\nIndex\t\t\tHash Function\t\tKey List");
        System.out.println("\t\t\th(k)= k mod "+this.maxIndex);

        for(int i=0; i<maxIndex; i++) System.out.printf("%d\t\t\t%d\t\t\t%s\n",this.rows[i].index, this.rows[i].hashValue, this.rows[i].keyList.displayLinkedList());
        System.out.println();
    }
}

public class HashTable {
    public static void main(String[] args) {
        Hash hash1= new Hash(5);
        
        hash1.insert(0);
        hash1.insert(5);
        hash1.insert(10);
        hash1.insert(1);
        hash1.insert(6);
        hash1.insert(2);
        hash1.insert(22);
        hash1.insert(3);
        hash1.display();
    }
}
