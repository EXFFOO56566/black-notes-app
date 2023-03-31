.class final synthetic Lcom/google/android/gms/internal/ads/av0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ws;

.field private final b:Lcom/google/android/gms/internal/ads/id1;

.field private final c:Lcom/google/android/gms/internal/ads/cc0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/wu0;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/cc0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/av0;->a:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/av0;->b:Lcom/google/android/gms/internal/ads/id1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/av0;->c:Lcom/google/android/gms/internal/ads/cc0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/av0;->a:Lcom/google/android/gms/internal/ads/ws;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/av0;->b:Lcom/google/android/gms/internal/ads/id1;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/av0;->c:Lcom/google/android/gms/internal/ads/cc0;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/id1;->E:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->Q()V

    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ws;->x()V

    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->h0:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->e()Lcom/google/android/gms/internal/ads/ll;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ll;->a(Lcom/google/android/gms/internal/ads/ws;)Z

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/cc0;->i()Lcom/google/android/gms/internal/ads/ac0;

    move-result-object p1

    return-object p1
.end method
