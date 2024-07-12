#
# Echo Server API
# Echo Server API
# Version: 0.1.0
# Contact: team@openapitools.org
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

To test HTTP basic authentication

.DESCRIPTION

No description available.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

String
#>
function Test-AuthHttpBasic {
    [CmdletBinding()]
    Param (
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Test-AuthHttpBasic' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('text/plain')

        $LocalVarUri = '/auth/http/basic'

        if ($Configuration["Username"] -and $Configuration["Password"]) {
            $LocalVarBytes = [System.Text.Encoding]::UTF8.GetBytes($Configuration["Username"] + ":" + (CompatibleConvertFrom-SecureString -SecureString $Configuration["Password"]))
            $LocalVarBase64Text =[Convert]::ToBase64String($LocalVarBytes)
            $LocalVarHeaderParameters['Authorization'] = "Basic " + $LocalVarBase64Text
            Write-Verbose ("Using HTTP basic authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "String" `
                                -IsBodyNullable $false

        [System.Runtime.InteropServices.Marshal]::ZeroFreeBSTR($LocalVarBytes)
        [System.Runtime.InteropServices.Marshal]::ZeroFreeBSTR($LocalVarBase64Text)
        [System.Runtime.InteropServices.Marshal]::ZeroFreeBSTR($LocalVarHeaderParameters['Authorization'])
        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

<#
.SYNOPSIS

To test HTTP bearer authentication

.DESCRIPTION

No description available.

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

String
#>
function Test-AuthHttpBearer {
    [CmdletBinding()]
    Param (
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Test-AuthHttpBearer' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('text/plain')

        $LocalVarUri = '/auth/http/bearer'

        if ($Configuration["AccessToken"]) {
            $LocalVarHeaderParameters['Authorization'] = "Bearer " + (CompatibleConvertFrom-SecureString -SecureString $Configuration["AccessToken"])
            Write-Verbose ("Using Bearer authentication in {0}" -f $MyInvocation.MyCommand)
        }

        $LocalVarResult = Invoke-ApiClient -Method 'POST' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "String" `
                                -IsBodyNullable $false

        [System.Runtime.InteropServices.Marshal]::ZeroFreeBSTR($LocalVarHeaderParameters['Authorization'])
        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}

