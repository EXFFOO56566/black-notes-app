.class public final Lcom/google/android/gms/internal/ads/nv1;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/nv1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/nv1;",
        "Lcom/google/android/gms/internal/ads/nv1$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/nv1;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzhpz:Lcom/google/android/gms/internal/ads/nv1;


# instance fields
.field private zzhpx:Ljava/lang/String;

.field private zzhpy:Lcom/google/android/gms/internal/ads/yz1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/yz1<",
            "Lcom/google/android/gms/internal/ads/vu1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/nv1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/nv1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/nv1;->zzhpz:Lcom/google/android/gms/internal/ads/nv1;

    const-class v1, Lcom/google/android/gms/internal/ads/nv1;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nv1;->zzhpx:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rz1;->o()Lcom/google/android/gms/internal/ads/yz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/nv1;->zzhpy:Lcom/google/android/gms/internal/ads/yz1;

    return-void
.end method

.method public static q()Lcom/google/android/gms/internal/ads/nv1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/nv1;->zzhpz:Lcom/google/android/gms/internal/ads/nv1;

    return-object v0
.end method

.method static synthetic r()Lcom/google/android/gms/internal/ads/nv1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/nv1;->zzhpz:Lcom/google/android/gms/internal/ads/nv1;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/mv1;->a:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/nv1;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/nv1;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/nv1;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/nv1;->zzhpz:Lcom/google/android/gms/internal/ads/nv1;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/nv1;->zzea:Lcom/google/android/gms/internal/ads/l12;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/ads/nv1;->zzhpz:Lcom/google/android/gms/internal/ads/nv1;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzhpx"

    aput-object v0, p1, p2

    const-string p2, "zzhpy"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-class p3, Lcom/google/android/gms/internal/ads/vu1;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/nv1;->zzhpz:Lcom/google/android/gms/internal/ads/nv1;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/nv1$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/nv1$a;-><init>(Lcom/google/android/gms/internal/ads/mv1;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/nv1;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/nv1;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/vu1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nv1;->zzhpy:Lcom/google/android/gms/internal/ads/yz1;

    return-object v0
.end method
