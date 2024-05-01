    package com.example.buensaboruno.domain.entities;

    import com.example.buensaboruno.domain.enums.Rol;
    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import org.hibernate.envers.Audited;
    import org.hibernate.envers.RelationTargetAuditMode;

    import java.util.List;

    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter
    public class Empleado extends Persona{

        @ManyToOne
        @JoinColumn(name = "sucursalEmpresa_id")
        private SucursalEmpresa sucursalEmpresa;

        @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
        private List<PedidoVenta> listaPedidoVenta;

        private Rol tipoEmpleado;

        @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Pedido> pedidos;

        @ManyToOne
        @JoinColumn(name = "sucursal_id")
        private Sucursal sucursal;
    }
