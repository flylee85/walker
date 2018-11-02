package walker.application.notify.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import walker.application.notify.entity.WalkerNotify;
import walker.application.notify.entity.WalkerNotifyExample;
import walker.application.notify.entity.WalkerTransaction;
import walker.application.notify.entity.WalkerTransactionExample;

public interface WalkerTransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int countByExample(WalkerTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int deleteByExample(WalkerTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int insert(WalkerTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int insertSelective(WalkerTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    List<WalkerTransaction> selectByExample(WalkerTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    WalkerTransaction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WalkerTransaction record, @Param("example") WalkerTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WalkerTransaction record, @Param("example") WalkerTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WalkerTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table walker_transaction
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WalkerTransaction record);

    List<WalkerTransaction> selectIndexedTableByExample(@Param("tableIndex")Integer tableIndex,WalkerTransactionExample example);

    int updateIndexedTableByExampleSelective(@Param("tableIndex")Integer tableIndex, @Param("record") WalkerTransaction record, @Param("example") WalkerTransactionExample example);

    int updateIndexedTableByPrimaryKeySelective(@Param("tableIndex")Integer tableIndex, @Param("record") WalkerTransaction record);

}