package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateDBImportJobRequest  extends AbstractModel{


    /**
    * 实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 文件名称。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;
    

    /**
    * 云数据库的用户名。
    */
    @SerializedName("User")
    @Expose
    private String User;
    

    /**
    * 云数据库实例User账号的密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;
    

    /**
    * 导入的目标数据库名，不传表示不指定数据库。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;
    

    /**
     * 获取实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例的ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取文件名称。
     * @return FileName 文件名称。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置文件名称。
     * @param FileName 文件名称。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取云数据库的用户名。
     * @return User 云数据库的用户名。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * 设置云数据库的用户名。
     * @param User 云数据库的用户名。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 获取云数据库实例User账号的密码。
     * @return Password 云数据库实例User账号的密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置云数据库实例User账号的密码。
     * @param Password 云数据库实例User账号的密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取导入的目标数据库名，不传表示不指定数据库。
     * @return DbName 导入的目标数据库名，不传表示不指定数据库。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * 设置导入的目标数据库名，不传表示不指定数据库。
     * @param DbName 导入的目标数据库名，不传表示不指定数据库。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "DbName", this.DbName);

    }
}
