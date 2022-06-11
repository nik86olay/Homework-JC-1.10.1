import com.fasterxml.jackson.annotation.JsonProperty;

//        id - уникальный идентификатор записи
//        text - сообщение
//        type - тип животного
//        user - имя пользователя
//        upvotes - голоса

public class Cat {
    String id;
    String text;
    String type;
    String user;
    String upVotes;

    public Cat(@JsonProperty ("id") String id,
               @JsonProperty ("text") String text,
               @JsonProperty ("type") String type,
               @JsonProperty ("user") String user,
               @JsonProperty ("upvotes") String upvotes) {

        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upVotes = upvotes;
    }

    public String getUpVotes() {
        return upVotes;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id +
                "\n text='" + text +
                "\n type='" + type +
                "\n user='" + user +
                "\n upVotes='" + upVotes +
                '}';
    }
}
