package lecture07;

import java.util.*;

public class LinkedListExamples {
    LinkedList<String> list = new LinkedList<>();

    public List <String> getCompanyOffices(){
        list.add("Sofia");
        list.add("London");
        list.add("Madrid");
        list.add("Barcelona");

        System.out.println("Company offices: " + list );
        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        return list;
    }

    public void addNewOffice(){
        list.add(3,"Paris");
        list.addFirst("Dublin");
        list.addLast("Berlin");
        System.out.println("Company offices after adding a new one: " + list);
    }

    public void changeOfficeName (){
        list.set(1,"London-West");
        System.out.println("Company offices after adding a new one: " + list);
    }

    public void removeOffice(){
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("Company offices after deleting one: " + list);
    }

    public int getOfficesCount(){
        System.out.println("Company offices list size: " + list.size());
        return list.size();
    }

    public void sortOffices(){
        Collections.sort(list);
        System.out.println("Company offices after sorting out: " + list);
    }

    public String getOfficeByIndex(int index){
        System.out.printf("Company office by index %d is %s",index,list.get(index));
        return list.get(index);
    }
}
