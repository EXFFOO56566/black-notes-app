.class public final Lcom/google/android/gms/internal/ads/rk2;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/rk2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/rk2;",
        "Lcom/google/android/gms/internal/ads/rk2$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static final zzbxx:Lcom/google/android/gms/internal/ads/rk2;

.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/rk2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzbxs:Ljava/lang/String;

.field private zzbxt:Lcom/google/android/gms/internal/ads/yz1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/yz1<",
            "Lcom/google/android/gms/internal/ads/pk2;",
            ">;"
        }
    .end annotation
.end field

.field private zzbxu:I

.field private zzbxv:I

.field private zzbxw:I

.field private zzdl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/rk2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rk2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/rk2;->zzbxx:Lcom/google/android/gms/internal/ads/rk2;

    const-class v1, Lcom/google/android/gms/internal/ads/rk2;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzbxs:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rz1;->o()Lcom/google/android/gms/internal/ads/yz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzbxt:Lcom/google/android/gms/internal/ads/yz1;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzbxu:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzbxv:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzbxw:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/rk2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/rk2;->a(Ljava/lang/String;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzdl:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/rk2;->zzdl:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rk2;->zzbxs:Ljava/lang/String;

    return-void
.end method

.method public static p()Lcom/google/android/gms/internal/ads/rk2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rk2;->zzbxx:Lcom/google/android/gms/internal/ads/rk2;

    return-object v0
.end method

.method static synthetic q()Lcom/google/android/gms/internal/ads/rk2;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/rk2;->zzbxx:Lcom/google/android/gms/internal/ads/rk2;

    return-object v0
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/hk2;->a:[I

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
    sget-object p1, Lcom/google/android/gms/internal/ads/rk2;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/rk2;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/rk2;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/rk2;->zzbxx:Lcom/google/android/gms/internal/ads/rk2;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/rk2;->zzea:Lcom/google/android/gms/internal/ads/l12;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/rk2;->zzbxx:Lcom/google/android/gms/internal/ads/rk2;

    return-object p1

    :pswitch_4
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdl"

    aput-object v0, p1, p2

    const-string p2, "zzbxs"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzbxt"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lcom/google/android/gms/internal/ads/pk2;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzbxu"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zzbxv"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzbxw"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/rk2;->zzbxx:Lcom/google/android/gms/internal/ads/rk2;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0008\u0000\u0002\u001b\u0003\u000c\u0001\u0004\u000c\u0002\u0005\u000c\u0003"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/rk2$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/rk2$a;-><init>(Lcom/google/android/gms/internal/ads/hk2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/rk2;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/rk2;-><init>()V

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
