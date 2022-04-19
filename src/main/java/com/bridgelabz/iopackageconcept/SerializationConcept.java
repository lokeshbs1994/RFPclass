package com.bridgelabz.iopackageconcept;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationConcept {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("test.txt"));
//        stream.writeObject(new Demo("Avinash"));
//        stream.flush();
//        stream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test.txt"));
        Demo demo = (Demo) inputStream.readObject();
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(demo));
    }
}

class Demo implements Serializable {
    private static final long serialVersionUID = -1950950204427891310L;
    private String name;

    public Demo() {
    }

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/**
 * hi
 * dxw54xuyvr67r67brfn76b67ede7ex57w786467476ce6vb809ny0b8tcx785x78578x95rx95r56x56x56x6x8645454
 * <p>
 * <p>
 * hi
 */