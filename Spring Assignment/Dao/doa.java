public class UserDao implements Dao&lt;User&gt; {

private List&lt;User&gt; users = new ArrayList&lt;&gt;();

public UserDao() {
users.add(new User(&quot;John&quot;, &quot;john@domain.com&quot;));
users.add(new User(&quot;Susan&quot;, &quot;susan@domain.com&quot;));
}

@Override
public Optional&lt;User&gt; get(long id) {
return Optional.ofNullable(users.get((int) id));
}

@Override
public List&lt;User&gt; getAll() {
return users;
}

@Override
