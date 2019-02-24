package cn.nandem.graphqljavaexperiments.web.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver
{
    public boolean testMutation(String flag)
    {
        return flag.equals("666");
    }
}
