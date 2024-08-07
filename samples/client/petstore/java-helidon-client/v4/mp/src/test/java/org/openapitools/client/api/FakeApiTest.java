/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.math.BigDecimal;
import org.openapitools.client.model.ChildWithNullable;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * OpenAPI Petstore Test
 *
 * API tests for FakeApi
 */
public class FakeApiTest {

    private static FakeApi client;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(FakeApi.class);
    }

    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeBigDecimalMapTest() throws Exception {
        //FakeBigDecimalMap200Response response = client.fakeBigDecimalMap();
        //assertNotNull(response);
    }
    
    /**
     * Health check endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeHealthGetTest() throws Exception {
        //HealthCheckResult response = client.fakeHealthGet();
        //assertNotNull(response);
    }
    
    /**
     * test http signature authentication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeHttpSignatureTestTest() throws Exception {
        //void response = client.fakeHttpSignatureTest(pet, query1, header1);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() throws Exception {
        //Boolean response = client.fakeOuterBooleanSerialize(body);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() throws Exception {
        //OuterComposite response = client.fakeOuterCompositeSerialize(outerComposite);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() throws Exception {
        //BigDecimal response = client.fakeOuterNumberSerialize(body);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() throws Exception {
        //String response = client.fakeOuterStringSerialize(body);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakePropertyEnumIntegerSerializeTest() throws Exception {
        //OuterObjectWithEnumProperty response = client.fakePropertyEnumIntegerSerialize(outerObjectWithEnumProperty);
        //assertNotNull(response);
    }
    
    /**
     * test referenced additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testAdditionalPropertiesReferenceTest() throws Exception {
        //void response = client.testAdditionalPropertiesReference(requestBody);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testBodyWithBinaryTest() throws Exception {
        //void response = client.testBodyWithBinary(body);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testBodyWithFileSchemaTest() throws Exception {
        //void response = client.testBodyWithFileSchema(fileSchemaTestClass);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testBodyWithQueryParamsTest() throws Exception {
        //void response = client.testBodyWithQueryParams(query, user);
        //assertNotNull(response);
    }
    
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testClientModelTest() throws Exception {
        //Client response = client.testClientModel(client);
        //assertNotNull(response);
    }
    
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() throws Exception {
        //void response = client.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
        //assertNotNull(response);
    }
    
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumParametersTest() throws Exception {
        //void response = client.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString);
        //assertNotNull(response);
    }
    
    /**
     * Fake endpoint to test group parameters (optional)
     *
     * Fake endpoint to test group parameters (optional)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testGroupParametersTest() throws Exception {
        //void response = client.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
        //assertNotNull(response);
    }
    
    /**
     * test inline additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() throws Exception {
        //void response = client.testInlineAdditionalProperties(requestBody);
        //assertNotNull(response);
    }
    
    /**
     * test inline free-form additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInlineFreeformAdditionalPropertiesTest() throws Exception {
        //void response = client.testInlineFreeformAdditionalProperties(testInlineFreeformAdditionalPropertiesRequest);
        //assertNotNull(response);
    }
    
    /**
     * test json serialization of form data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testJsonFormDataTest() throws Exception {
        //void response = client.testJsonFormData(param, param2);
        //assertNotNull(response);
    }
    
    /**
     * test nullable parent property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testNullableTest() throws Exception {
        //void response = client.testNullable(childWithNullable);
        //assertNotNull(response);
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryParameterCollectionFormatTest() throws Exception {
        //void response = client.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context, allowEmpty, language);
        //assertNotNull(response);
    }
    
    /**
     * test referenced string map
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testStringMapReferenceTest() throws Exception {
        //void response = client.testStringMapReference(requestBody);
        //assertNotNull(response);
    }
    
}
