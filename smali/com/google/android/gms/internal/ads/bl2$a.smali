.class public final Lcom/google/android/gms/internal/ads/bl2$a;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/bl2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/bl2$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/rz1<",
        "Lcom/google/android/gms/internal/ads/bl2$a;",
        "Lcom/google/android/gms/internal/ads/bl2$a$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# static fields
.field private static final zzcay:Lcom/google/android/gms/internal/ads/wz1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/wz1<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/gms/internal/ads/pk2$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

.field private static volatile zzea:Lcom/google/android/gms/internal/ads/l12;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/l12<",
            "Lcom/google/android/gms/internal/ads/bl2$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzcat:J

.field private zzcau:I

.field private zzcav:J

.field private zzcaw:J

.field private zzcax:Lcom/google/android/gms/internal/ads/xz1;

.field private zzcaz:Lcom/google/android/gms/internal/ads/zk2;

.field private zzcba:I

.field private zzcbb:I

.field private zzcbc:I

.field private zzcbd:I

.field private zzcbe:I

.field private zzcbf:I

.field private zzdl:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/cm2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/cm2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcay:Lcom/google/android/gms/internal/ads/wz1;

    new-instance v0, Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bl2$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

    const-class v1, Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/rz1;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/rz1;->m()Lcom/google/android/gms/internal/ads/xz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcax:Lcom/google/android/gms/internal/ads/xz1;

    return-void
.end method

.method public static a([B)Lcom/google/android/gms/internal/ads/bl2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/rz1;[B)Lcom/google/android/gms/internal/ads/rz1;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/bl2$a;

    return-object p0
.end method

.method private final a(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcat:J

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bl2$a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bl2$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/bl2$a;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/bl2$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->a(Lcom/google/android/gms/internal/ads/bl2$c;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->a(Lcom/google/android/gms/internal/ads/wl2;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/zk2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->a(Lcom/google/android/gms/internal/ads/zk2;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bl2$a;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->a(Ljava/lang/Iterable;)V

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/bl2$c;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bl2$c;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbf:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wl2;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcau:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/zk2;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcaz:Lcom/google/android/gms/internal/ads/zk2;

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method private final a(Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/google/android/gms/internal/ads/pk2$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcax:Lcom/google/android/gms/internal/ads/xz1;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/yz1;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcax:Lcom/google/android/gms/internal/ads/xz1;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/xz1;)Lcom/google/android/gms/internal/ads/xz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcax:Lcom/google/android/gms/internal/ads/xz1;

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/pk2$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcax:Lcom/google/android/gms/internal/ads/xz1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pk2$a;->a()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/xz1;->a(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final b(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbd:I

    return-void
.end method

.method private final b(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcav:J

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/bl2$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/bl2$a;->b(J)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->b(Lcom/google/android/gms/internal/ads/wl2;)V

    return-void
.end method

.method private final b(Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wl2;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcba:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method private final c(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcaw:J

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/bl2$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/bl2$a;->c(J)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->c(Lcom/google/android/gms/internal/ads/wl2;)V

    return-void
.end method

.method private final c(Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wl2;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbb:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->d(Lcom/google/android/gms/internal/ads/wl2;)V

    return-void
.end method

.method private final d(Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wl2;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbc:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method static synthetic e(Lcom/google/android/gms/internal/ads/bl2$a;Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/bl2$a;->e(Lcom/google/android/gms/internal/ads/wl2;)V

    return-void
.end method

.method private final e(Lcom/google/android/gms/internal/ads/wl2;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wl2;->a()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbe:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzdl:I

    return-void
.end method

.method public static r()Lcom/google/android/gms/internal/ads/bl2$a$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rz1;->j()Lcom/google/android/gms/internal/ads/rz1$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/bl2$a$a;

    return-object v0
.end method

.method static synthetic s()Lcom/google/android/gms/internal/ads/bl2$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/bl2$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/bl2$a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/bl2$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/rz1$c;

    sget-object p3, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/rz1$c;-><init>(Lcom/google/android/gms/internal/ads/rz1;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/bl2$a;->zzea:Lcom/google/android/gms/internal/ads/l12;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

    return-object p1

    :pswitch_4
    const/16 p1, 0x14

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdl"

    aput-object v0, p1, p2

    const-string p2, "zzcat"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzcau"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzcav"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "zzcaw"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zzcax"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    invoke-static {}, Lcom/google/android/gms/internal/ads/pk2$a;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzcaz"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzcba"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzcbb"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzcbc"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-string p3, "zzcbd"

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzcbe"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    invoke-static {}, Lcom/google/android/gms/internal/ads/wl2;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x12

    const-string p3, "zzcbf"

    aput-object p3, p1, p2

    const/16 p2, 0x13

    invoke-static {}, Lcom/google/android/gms/internal/ads/bl2$c;->b()Lcom/google/android/gms/internal/ads/vz1;

    move-result-object p3

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/bl2$a;->zzcbg:Lcom/google/android/gms/internal/ads/bl2$a;

    const-string p3, "\u0001\u000c\u0000\u0001\u0001\u000c\u000c\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u000c\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u001e\u0006\t\u0004\u0007\u000c\u0005\u0008\u000c\u0006\t\u000c\u0007\n\u0004\u0008\u000b\u000c\t\u000c\u000c\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/rz1;->a(Lcom/google/android/gms/internal/ads/c12;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/bl2$a$a;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/bl2$a$a;-><init>(Lcom/google/android/gms/internal/ads/hk2;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/bl2$a;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/bl2$a;-><init>()V

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

.method public final p()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcat:J

    return-wide v0
.end method

.method public final q()Lcom/google/android/gms/internal/ads/wl2;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bl2$a;->zzcau:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/wl2;->a(I)Lcom/google/android/gms/internal/ads/wl2;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/wl2;->c:Lcom/google/android/gms/internal/ads/wl2;

    :cond_0
    return-object v0
.end method
