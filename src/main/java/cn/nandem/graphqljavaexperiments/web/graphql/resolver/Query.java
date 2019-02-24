package cn.nandem.graphqljavaexperiments.web.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver
{
    public int testQuery()
    {
        return 666;
    }
}
