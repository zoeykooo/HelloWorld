package dao_.test;

import dao_.dao.ActorDAO;

public class TestDAO {
    public void testActorDAO(){
        ActorDAO actorDAO =new ActorDAO();

        //list<Actor> actors =actorDAO.queryMulti("select * from actor where id >=?",Actor.class,1);
    }
}
