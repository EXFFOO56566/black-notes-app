.class public final Lcom/google/android/gms/internal/ads/r40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/m80;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/zd1;

.field private final d:Lcom/google/android/gms/internal/ads/fo;

.field private final e:Lcom/google/android/gms/internal/ads/yk;

.field private final f:Lcom/google/android/gms/internal/ads/uo0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zd1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/yk;Lcom/google/android/gms/internal/ads/uo0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/r40;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/r40;->c:Lcom/google/android/gms/internal/ads/zd1;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/r40;->d:Lcom/google/android/gms/internal/ads/fo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/r40;->e:Lcom/google/android/gms/internal/ads/yk;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/r40;->f:Lcom/google/android/gms/internal/ads/uo0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;)V
    .locals 4

    sget-object p1, Lcom/google/android/gms/internal/ads/zr2;->D1:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/r40;->e:Lcom/google/android/gms/internal/ads/yk;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/yk;->i()Lcom/google/android/gms/internal/ads/jk;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->k()Lcom/google/android/gms/ads/internal/d;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/r40;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/r40;->d:Lcom/google/android/gms/internal/ads/fo;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/r40;->c:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/ads/internal/d;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Ljava/lang/String;Lcom/google/android/gms/internal/ads/jk;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/r40;->f:Lcom/google/android/gms/internal/ads/uo0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/uo0;->a()V

    return-void
.end method
