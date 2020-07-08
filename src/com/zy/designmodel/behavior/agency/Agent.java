package com.zy.designmodel.behavior.agency;

import com.zy.designmodel.behavior.agency.lease.Lessor;
import com.zy.designmodel.behavior.agency.lease.Lessors;
import com.zy.designmodel.behavior.agency.tenant.Tenant;
import com.zy.designmodel.behavior.agency.tenant.Tenants;

public class Agent implements Agency {

    private Lessors leasor;
    private Tenants tenant;

    public Agent(Lessors leasor, Tenants tenant) {
        this.leasor = leasor;
        this.tenant = tenant;
    }

    @Override
    public void lease() {
        leasor.lease();
    }

    @Override
    public void rend() {
        tenant.rend();
        tenant.visitHouse();
        tenant.giveMoney();
    }

    @Override
    public void giveKey() {
        leasor.giveKey();
    }

    public static void main(String args[]){
        Agency agency=new Agent(new Lessor(),new Tenant());
        //房主让中介公示出租房间
        agency.lease();
        //租客跟着中介参观房间
        agency.rend();
        //中介把房主的钥匙给租客
        agency.giveKey();
    }
}
